package com.example.sendform;

import com.example.sendform.service.XmlFileProcess;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;
import org.xmlunit.diff.Diff;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class TestXmlFileProcess {

    private XmlFileProcess xmlFileProcess;

    private String code260 = "260";
    private String code10615 = "10615";
    private String code77290 = "77290";
    private String sourceFilePath260 = "src/test/resources/test260.xml";
    private String targetFilePath260 = "src/test/resources/test260!.xml";
    private String sourceFilePath10615 = "src/test/resources/test10615.xml";
    private String targetFilePath10615 = "src/test/resources/test10615!.xml";
    private String sourceFilePath77290 = "";
    private String targetFilePath77290 = "";

    @Before
    public void init() {
        xmlFileProcess = new XmlFileProcess();
    }

    @Test
    public void testProcess() throws IOException, SAXException, ParserConfigurationException {

        Diff diff = xmlFileProcess.process(sourceFilePath10615, targetFilePath10615, code10615);

        System.out.println(diff.getDifferences());
        System.out.println(diff.hasDifferences());
    }
}
