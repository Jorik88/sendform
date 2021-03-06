package com.example.sendform;

import com.example.sendform.service.RefactorXmlFileService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAmlRequest {

    @Autowired
    RefactorXmlFileService service;


    @Test
    public void testSend() throws IOException, SAXException, ParserConfigurationException {
//        service.refactor();
        service.m1();
    }

    @Test
    public void replace() {
        String str = "jhjhjundefinedfewww";
        if (str.contains("undefined")) {
            str = str.replace("undefined", "");
        }
        System.out.println(str);
    }

    @Test
    public void testChangeContent() throws ParserConfigurationException, TransformerException, SAXException, IOException {
        service.refactor();
    }
}
