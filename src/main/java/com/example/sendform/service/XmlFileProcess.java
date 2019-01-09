package com.example.sendform.service;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.builder.Input;
import org.xmlunit.diff.Diff;

import javax.annotation.PostConstruct;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.*;

@Service
@Log4j
public class XmlFileProcess {

    private Map<String, List<String>> codeAndExcludedNodesMap;

    public XmlFileProcess() {
        init();
    }

    @PostConstruct
    public void init() {
        codeAndExcludedNodesMap = new HashMap<>();
        List<String> code260 = Arrays.asList("StartDate", "Series");
        List<String> code10615 = Arrays.asList("street", "powerHp");
        List<String> code77290 = Arrays.asList("", "");

        codeAndExcludedNodesMap.put("260", code260);
        codeAndExcludedNodesMap.put("10615", code10615);
        codeAndExcludedNodesMap.put("77290", code77290);
    }


    public Diff process(String sourceFileName, String targetFileName, String code) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = dbf.newDocumentBuilder();
        Document sourceDoc = docBuilder.parse(sourceFileName);
        Document targetDoc = docBuilder.parse(targetFileName);

        Diff diff;
        switch (code) {
            case "260":
                diff = compare(sourceDoc.getElementsByTagName("Result").item(0),
                        targetDoc.getElementsByTagName("Result").item(0),
                        codeAndExcludedNodesMap.get(code));
                break;

            case "10615":
                diff = compare(sourceDoc.getElementsByTagName("AppData").item(0),
                        targetDoc.getElementsByTagName("AppData").item(0),
                        codeAndExcludedNodesMap.get(code));
                break;

            case "77290":
                diff = compare(sourceDoc.getElementsByTagName("Extract").item(0),
                        targetDoc.getElementsByTagName("Extract").item(0),
                        codeAndExcludedNodesMap.get(code));
                break;

            default:
                throw new IllegalArgumentException("Wrong code!");
        }
        return diff;
    }

    private Diff compare(Node source, Node target, List<String> excludedNodes) {
        return DiffBuilder
                .compare(Input.fromNode(source))
                .withTest(Input.fromNode(target))
                .withNodeFilter(n -> !excludedNodes.contains(n.getNodeName()))
                .build();
    }

}
