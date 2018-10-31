package com.example.sendform.service;

import org.springframework.http.*;
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
    private static final String TRANSACTION_ID = "b4dfb586-bacd-4e08-94a5-164cdf657f57";
    private static final String REDIRECT_URL= "https://localhost:9000/api/processing/status";
    private static final String OAUTH_TOKEN = "964932d6-d615-40ae-96f2-7eb2cede12ff";

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
        String value = "transactionId=" + TRANSACTION_ID;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<String> httpEntity = new HttpEntity<>(value, headers);
        HttpEntity<String> response = restTemplate.exchange(URL, HttpMethod.POST, httpEntity, String.class);
        HttpHeaders responseHeaders = response.getHeaders();
        String set_cookie = responseHeaders.getFirst(HttpHeaders.COOKIE);
        System.out.println(set_cookie);
        return set_cookie;
    }

    public String sendAndRedirect(String cookie) {
        String url = REDIRECT_URL + "?transactionId=" + TRANSACTION_ID;
        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.add("Cookie", cookie);
        headers.add(HttpHeaders.AUTHORIZATION, "Bearer" + OAUTH_TOKEN);
        HttpEntity httpEntity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);
        String rss = response.getBody();
        System.out.println(response);
        return rss;
    }
}
