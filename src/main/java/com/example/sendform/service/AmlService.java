package com.example.sendform.service;

import com.example.sendform.model.AmlCheckResult;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class AmlService {

//
//    private final VerificationDataRepository dataRepository;
//    private final RemoteCountryDataService countryDataService;
//
//    private static final String DOCUMENT_PATH = "src/main/resources/aml.xml";
//    private static final String DOCUMENT_ENCODING = "windows-1251";
//    private static final String PARAMETERS_TAG_NAME = "parameters";
//    private static final String P_TAG_NAME = "p";
//    private static final String ATTRIBUTE_FULL_NAME_VALUE = "people_full_name";
//    private static final String ATTRIBUTE_ADDRESS_VALUE = "person_address";
//    private static final String ATTRIBUTE_DOCUMENT_VALUE = "people_document";
//    private static final String DOCUMENT_TAG_NAME = "Description";
//    private static final String AML_REQUEST_URL = "http://localhost:9001/itwGateWS/exec/FISPut";
//
//    @Autowired
//    public AmlService(VerificationDataRepository dataRepository, RemoteCountryDataService countryDataService) {
//        this.countryDataService = countryDataService;
//        this.dataRepository = dataRepository;
//    }
//
//
//    public void check() {
//        try {
//
//            List<VerificationDataEntity> records = dataRepository.findFirst5ByCurrentStage("Review_complete");
//
//            for (VerificationDataEntity entity : records) {
//
////                do some
//            }
//
//        } catch (Exception e) {
//            log.warn("Error while changing user verification stage", e);
//        }
//    }
//
//    public void sendRequest(VerificationDataEntity entity) throws ParserConfigurationException, IOException, SAXException {
//        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
//        Document doc = docBuilder.parse(DOCUMENT_PATH);
//
//        Node item = doc.getElementsByTagName(PARAMETERS_TAG_NAME).item(0);
//        Element element = (Element) item;
//
//        setContent(doc, element, entity);
//        doc.setXmlStandalone(true);
//
//        OutputFormat format    = new OutputFormat(doc);
//        format.setEncoding(DOCUMENT_ENCODING);
//        // as a String
//        StringWriter stringOut = new StringWriter();
//        XMLSerializer serial   = new XMLSerializer(stringOut, format);
//        serial.serialize(doc);
//        OkHttpClient client = new OkHttpClient();
//
//        okhttp3.MediaType mediaType = okhttp3.MediaType.parse("text/xml");
//        RequestBody body = RequestBody.create(mediaType, stringOut.toString());
//        Request request = new Request.Builder()
//                .url(AML_REQUEST_URL)
//                .post(body)
//                .addHeader("content-type", "text/xml")
//                .build();
//
//        Response response = client.newCall(request).execute();
//
//        if (response.body() != null) {
//            AmlCheckResult amlCheckResult = parseResponse(response.body().string());
//        }
//    }
//
//    private void setContent(Document doc, Element element, VerificationDataEntity entity) {
//        if (entity.getFields() == null) {
//            throw new IllegalStateException("Failed send request for entity id=" + entity.getUserId());
//        }
//        Map<String, String> fields = entity.getFields();
//
//        Element pName = doc.createElement(P_TAG_NAME);
//        pName.setAttribute("name", ATTRIBUTE_FULL_NAME_VALUE);
//        pName.appendChild(doc.createTextNode(getFullName(fields)));
//        element.appendChild(pName);
//
//        Element pPassportData = doc.createElement(P_TAG_NAME);
//        pPassportData.setAttribute("name", ATTRIBUTE_DOCUMENT_VALUE);
//        pPassportData.appendChild(doc.createTextNode(fields.get("passportId")));
//        element.appendChild(pPassportData);
//
//        Element pAddress = doc.createElement(P_TAG_NAME);
//        pAddress.setAttribute("name", ATTRIBUTE_ADDRESS_VALUE);
//        pAddress.appendChild(doc.createTextNode(getAddressData(fields)));
//        element.appendChild(pAddress);
//    }
//
//    public AmlCheckResult parseResponse(String responseString) throws ParserConfigurationException, IOException, SAXException {
//        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
//
//        Document doc = docBuilder.parse(new InputSource(new StringReader(responseString)));
//
//        NodeList childNodes = doc.getElementsByTagName(DOCUMENT_TAG_NAME).item(0).getChildNodes();
//        NodeList nodes = ((Node) childNodes).getChildNodes();
//
//        AmlCheckResult amlCheckResult = new AmlCheckResult();
//
//        for (int i = 0; i < nodes.getLength(); i++) {
//            if ("PEOPLE_FULL_NAME".equals(nodes.item(i).getFirstChild().getTextContent())) {
//                String textContent = nodes.item(i).getLastChild().getTextContent();
//                amlCheckResult.getPersonalData().add(textContent);
//            } else if ("PERSON_ADDRESS".equals(nodes.item(i).getFirstChild().getTextContent())) {
//                String textContent = nodes.item(i).getLastChild().getTextContent();
//                amlCheckResult.getAddressData().add(textContent);
//            }else if ("PEOPLE_DOCUMENT".equals(nodes.item(i).getFirstChild().getTextContent())) {
//                String textContent = nodes.item(i).getLastChild().getTextContent();
//                amlCheckResult.getPassportData().add(textContent);
//            }
//        }
//        return amlCheckResult;
//    }
//
//    public String getFullName(Map<String, String> fields) {
//        String middleName = fields.get("middleName");
//        if (middleName == null) {
//            middleName = "";
//        }
//        return String.format("%s %s %s",
//                fields.get("firstName"),
//                fields.get("lastName"),
//                middleName);
//    }
//
//    public String getAddressData(Map<String, String> fields) {
//        String registrationAddress = fields.get("registrationAddress1");
//        if (registrationAddress.contains("undefined")) {
//            registrationAddress = registrationAddress.replace(" undefined", "");
//        }
//
//        String registrationCountryName =
//                countryDataService.getCountryNameByCountryCode(fields.get("registrationCountryCode"), getLang(registrationAddress));
//        return String.format("%s %s", registrationCountryName, registrationAddress);
//    }
//
//    private String getLang(String registrationAddress) {
//        if (registrationAddress.matches("[а-яА-Я0-9 ]*")) {
//            return "ru";
//        }
//        return "en";
//    }


    //RemoteCountryDataService  changes


//    public String getCountryNameByCountryCode(String countryCode, String lang) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("geoEntities.code.countryIsoCode").is(countryCode));
//        GeoRegion one = mongoTemplate.findOne(query, GeoRegion.class, collection);
//        List<GeoEntity> geoEntities = one.getGeoEntities();
//
//        GeoEntity geoEntity = geoEntities.stream()
//                .filter(entity -> countryCode.equals(entity.getCode().get("countryIsoCode")))
//                .findAny().orElse(null);
//
//        if (geoEntity == null || geoEntity.getNames().isEmpty()) {
//            log.warn("Error while getting country name by code={}", countryCode);
//            throw new IllegalArgumentException("Error while getting country name by code=" + countryCode);
//        } else {
//            return geoEntity.getNames().get(lang);
//        }
//    }

}
