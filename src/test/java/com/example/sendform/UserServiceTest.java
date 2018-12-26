package com.example.sendform;

import com.example.sendform.model.Operation;
import com.example.sendform.model.User;
import com.example.sendform.service.UserService;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.bind.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class UserServiceTest {

    private UserService userService = new UserService();


    @Test
    public void testCheck() throws JAXBException {
        userService.check();
    }

    @Test
    public void unmarshal() {
        String s = "<ueweser>\n" +
                 "<user>\n" +
                "<name>Vova</name>\n" +
                "<lastName>Ivanov</lastName>\n" +
                "<last>fdgfddf</last>\n" +
                "<year>44</year>\n" +
                "<email>ivanov@gmail.com</email>\n" +
                "</user>\n" +
                "</ueweser>";
        User unmarshal = JAXB.unmarshal(new StringReader(s), User.class);

        String d = "<user>\\n\" +\n" +
                "                \"<name>Vova</name>\\n\" +\n" +
                "                \"<lastName>Petro</lastName>\\n\" +\n" +
                "                \"<last>fdgfddf</last>\\n\" +\n" +
                "                \"<lewrewast>fdgfddf</lewrewast>\\n\" +\n" +
                "                \"<year>32</year>\\n\" +\n" +
                "                \"<email>ivanov@gmail1.com</email>\\n\" +\n" +
                "                \"</user>";
        User user = JAXB.unmarshal(new StringReader(d), User.class);
        System.out.println(user);
        System.out.println(unmarshal.equals(user));
    }

    @Test
    public void test() throws IOException {

        byte[] bytes = "JVBERi0xLjQKJaqrrK0KMSAwIG9iago8PAovQ3JlYXRvciAoQXBhY2hlIEZPUCBWZXJzaW9uIDIuMikKL1Byb2R1Y2VyIChBcGFjaGUgRk9QIFZlcnNpb24gMi4yKQovQ3JlYXRpb25EYXRlIChEOjIwMTgxMjI1MDgwNjI4KzAzJzAwJykKPj4KZW5kb2JqCjIgMCBvYmoKPDwKICAvTiAzCiAgL0xlbmd0aCAzIDAgUgogIC9GaWx0ZXIgL0ZsYXRlRGVjb2RlCj4".getBytes("UTF-8");
        byte[] decoded = Base64.getDecoder().decode(bytes);

        System.out.println(new String(decoded));

//        File file = new File("newfile.pdf");
//        FileOutputStream fop = new FileOutputStream(file);
//
//        fop.write(decoded);
//        fop.flush();
//        fop.close();
    }

    @Test
    public void createPdf() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("test.txt")));
        byte[] bytes = content.getBytes();
        byte[] decoded = Base64.getDecoder().decode(bytes);
        String result = new String(decoded).replace("\n", "").replace("\r", "").replace("   ", "");
        System.out.println(result);
        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);

        PDPageContentStream contentStream = new PDPageContentStream(document, page);

        contentStream.setFont(PDType1Font.COURIER, 12);
        contentStream.beginText();
        contentStream.showText(result);
        contentStream.endText();
        contentStream.close();

        document.save("pdfBoxHelloWorld.pdf");
        document.close();
    }

    @Test
    public void testM1() throws IOException {
        String content = "oSkZARw9NaLMscl627T1qyXTfk0rgfjM5K/WKB/Ayh2ZYs3aTAQDtewf/4Wb65t6wllU63PBWuOUecaUJNxJ6w==";
        byte[] bytes = content.getBytes("UTF-8");
        byte[] decoded = Base64.getDecoder().decode(bytes);
        String result = new String(decoded).replace("\n", "").replace("\r", "");
        System.out.println(result);

    }

    @Test
    public void testOperationDesirialize() throws IOException {
        String s =
                "                                    <operation>\n" +
                "                                        <lastName>ТРЫКИН</lastName>\n" +
                "                                        <firstName>ПЕТР</firstName>\n" +
                "                                        <middleName>ИВАНОВИЧ</middleName>\n" +
                "                                        <birthday>1952-02-04T00:00:00</birthday>\n" +
                "                                        <region>г. Москва</region>\n" +
                "                                        <area>БАСМАННЫЙ (ЦАО) Р-Н</area>\n" +
                "                                        <street>БРИГАДИРСКИЙ ПЕР.</street>\n" +
                "                                        <house>3-5</house>\n" +
                "                                        <apartment>102</apartment>\n" +
                "                                        <departmentCode>152</departmentCode>\n" +
                "                                        <registrationPlate>Е518ВН750</registrationPlate>\n" +
                "                                        <brandAndModel>ФОРД КУГА</brandAndModel>\n" +
                "                                        <vehicleCategory>В</vehicleCategory>\n" +
                "                                        <vin>Z6FАХХЕSМАЕR26291</vin>\n" +
                "                                        <maxAllowedWeight>2200</maxAllowedWeight>\n" +
                "                                        <weightWithoutLoad>1682</weightWithoutLoad>\n" +
                "                                        <color>БЕЛЫЙ</color>\n" +
                "                                        <registrationDocument>5032870509</registrationDocument>\n" +
                "                                        <registrationDate>2015-05-16T00:00:00</registrationDate>\n" +
                "                                        <personType>2</personType>\n" +
                "                                        <ownerBirthPlace>РЯЗАНСКАЯ ОБЛ. С.ОСТРОВКА МОЖАРСКОГО Р-Н</ownerBirthPlace>\n" +
                "                                        <citizenship>РОССИЙСКАЯ ФЕДЕРАЦИЯ</citizenship>\n" +
                "                                        <sex>1</sex>\n" +
                "                                        <ownerPhone>9166789410</ownerPhone>\n" +
                "                                        <productionYear>2014</productionYear>\n" +
                "                                        <powerHp>149</powerHp>\n" +
                "                                        <powerKwt>110</powerKwt>\n" +
                "                                        <engineVolume>1596</engineVolume>\n" +
                "                                    </operation>\n";

        String content = new String(Files.readAllBytes(Paths.get("test.xml")));
        Operation unmarshal = JAXB.unmarshal(new StringReader(content), Operation.class);
        System.out.println(unmarshal);
    }

    @Test
    public void testDeserializePartOfFile() throws XMLStreamException, JAXBException {
        XMLInputFactory xif = XMLInputFactory.newFactory();
        StreamSource xml = new StreamSource("test1.xml");
        XMLStreamReader xsr = xif.createXMLStreamReader(xml);
        xsr.nextTag();
        while(!xsr.getLocalName().equals("operation")) {
            xsr.nextTag();
        }

        JAXBContext jc = JAXBContext.newInstance(Operation.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        JAXBElement<Operation> jb = unmarshaller.unmarshal(xsr, Operation.class);
        xsr.close();

        Operation customer = jb.getValue();
        System.out.println(customer);
    }


    // THIS IS A WORKING VERSION >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    @Test
    public void testDom() throws JAXBException, ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = dbf.newDocumentBuilder();
        Document document = docBuilder.parse("test1.xml");

        // create JAXBContext which will be used to create a Binder
        JAXBContext jc = JAXBContext.newInstance(Operation.class);

        // create binder
        Binder<Node> binder = jc.createBinder();

        // get xml node from the document
        Node xmlNode = document.getElementsByTagName("operation").item(0);

        // unmarshal the xml
        JAXBElement<Operation> jst = binder.unmarshal(xmlNode, Operation.class);

        // get student object
        Operation st = jst.getValue();

        System.out.println(st);
    }
}
