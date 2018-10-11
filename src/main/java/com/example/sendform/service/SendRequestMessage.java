package com.example.sendform.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class SendRequestMessage {

    private RestTemplate restTemplate = new RestTemplate(SSLClientFactory.getClientHttpRequestFactory(SSLClientFactory.HttpClientType.HttpClient));

    private static final String URL = "https://localhost:9000/api/processing/process";

    public void send() {
        String xmlString =
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
                "<body>" +
                "<input type=\"hidden\" name=\"transactionId\" value=\"e87ba625-32dd-4850-b7a9-78d2017375c1\"/>" +
                "</body>";

        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        messageConverters.add(new StringHttpMessageConverter());
        restTemplate.setMessageConverters(messageConverters);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_HTML);
        HttpEntity<String> request = new HttpEntity<>(xmlString, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(URL, request, String.class);
    }

    public String send1() {
        String value = "transactionId=e87ba625-32dd-4850-b7a9-78d2017375c1";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<String> httpEntity = new HttpEntity<>(value, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(URL, httpEntity, String.class);
        return response.getBody();
    }
}
