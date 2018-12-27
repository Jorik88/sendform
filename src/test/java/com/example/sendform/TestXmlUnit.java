package com.example.sendform;

import org.custommonkey.xmlunit.XMLUnit;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.builder.Input;
import org.xmlunit.diff.Diff;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestXmlUnit {

    private List<String> exclude;


    @Before
    public void init() {
        exclude = new ArrayList<>();
        exclude.add("Snils");
    }

    @Test
    public void exclude() throws FileNotFoundException {
        // reading two xml file to compare in Java program
        FileInputStream fis1 = new FileInputStream("src/test/resources/test260.xml");
        FileInputStream fis2 = new FileInputStream("src/test/resources/test260!.xml");

        // using BufferedReader for improved performance
        BufferedReader source = new BufferedReader(new InputStreamReader(fis1));
        BufferedReader target = new BufferedReader(new InputStreamReader(fis2));

        //configuring XMLUnit to ignore white spaces
        XMLUnit.setIgnoreWhitespace(true);
        System.out.println(compareXml(source, target));
    }

    public boolean compareXml(Reader source, Reader target) {
        Diff diff = DiffBuilder
                .compare(Input.fromReader(source))
                .withTest(Input.fromReader(target))
//                .withNodeFilter(node -> !node.getNodeName().equals("Snils"))
                .withNodeFilter(n -> !exclude.contains(n.getNodeName()))
                .build();
        System.out.println(diff.getDifferences());
        return diff.hasDifferences();
    }

    @Test
    public void testNode() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = dbf.newDocumentBuilder();
        Document document = docBuilder.parse("src/test/resources/test260.xml");
        Node xmlNode = document.getElementsByTagName("Result").item(0);

        Document document1 = docBuilder.parse("src/test/resources/test260!.xml");
        Node node = document1.getElementsByTagName("Result").item(0);

        Diff diff = DiffBuilder.compare(Input.fromNode(xmlNode))
                .withTest(Input.fromNode(node))
                .build();

        System.out.println(diff.hasDifferences());
        System.out.println(diff.getDifferences());
    }
}
