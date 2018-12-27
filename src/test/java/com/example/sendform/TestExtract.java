package com.example.sendform;

import org.junit.Test;
import package1.Extract;
import package2.PreferentialCategoriesFullResponseType;

import javax.xml.bind.JAXB;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestExtract {

    @Test
    public void test() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("test7760.xml")));
        Extract unmarshal = JAXB.unmarshal(new StringReader(content), Extract.class);
        System.out.println(unmarshal);
    }

    @Test
    public void test260() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("src/test/resources/for_xsd-260.xml")));
        PreferentialCategoriesFullResponseType unmarshal = JAXB.unmarshal(new StringReader(content), PreferentialCategoriesFullResponseType.class);
        System.out.println(unmarshal);

        String fcontent = new String(Files.readAllBytes(Paths.get("src/test/resources/260-f.xml")));
        PreferentialCategoriesFullResponseType fullResponseType = JAXB.unmarshal(new StringReader(fcontent), PreferentialCategoriesFullResponseType.class);
        System.out.println(fullResponseType);

        System.out.println(unmarshal.equals(fullResponseType));
    }
}
