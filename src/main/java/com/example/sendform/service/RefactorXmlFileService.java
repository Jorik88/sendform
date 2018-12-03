package com.example.sendform.service;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

@Service
public class RefactorXmlFileService {

    private RestTemplate restTemplate = new RestTemplate(SSLClientFactory.getClientHttpRequestFactory(SSLClientFactory.HttpClientType.HttpClient));
    private static final String URL = "http://localhost:9000/itwGateWS/exec/FISPut";


    public void refactor() throws ParserConfigurationException, IOException, SAXException, TransformerException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.parse("src/main/resources/templates/aml.xml");

        Node item = doc.getElementsByTagName("parameters").item(0);
        Element element = (Element) item;

        setContent(doc, element);
        doc.setXmlStandalone(true);

        OutputFormat format    = new OutputFormat(doc);
        format.setEncoding("windows-1251");
        // as a String
        StringWriter stringOut = new StringWriter();
        XMLSerializer serial   = new XMLSerializer(stringOut, format);
        serial.serialize(doc);
        // Display the XML
        System.out.println(stringOut.toString());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_XML);
        HttpEntity<String> httpEntity = new HttpEntity<>(stringOut.toString(), headers);
        HttpEntity<String> response = restTemplate.exchange(URL, HttpMethod.POST, httpEntity, String.class);

        writeXml(doc);

        System.out.println(response);
        System.out.println("Done");
    }

    private void setContent(Document doc, Element element) {
        Element pTest = doc.createElement("p");
        pTest.setAttribute("name", "test");
        pTest.appendChild(doc.createTextNode("Иванов иван иванович"));
        element.appendChild(pTest);

        Element pMessage = doc.createElement("p");
        pMessage.setAttribute("name", "message");
        pMessage.appendChild(doc.createTextNode("test"));
        element.appendChild(pMessage);
    }

    private void writeXml(Document doc) throws TransformerException {
//         write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("src/main/resources/templates/aml1.xml"));
        transformer.transform(source, result);
    }

}
