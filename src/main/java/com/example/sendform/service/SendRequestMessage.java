package com.example.sendform.service;

import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.thymeleaf.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

@Service
public class SendRequestMessage {

    private RestTemplate restTemplate = new RestTemplate(SSLClientFactory.getClientHttpRequestFactory(SSLClientFactory.HttpClientType.HttpClient));

    private static final String URL = "https://localhost:9000/api/processing/process";
    private static final String TRANSACTION_ID = "2f92a24e-5439-44b5-a839-fea5791d6e6a";
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

    public List<String> send1() {
        String value = "transactionId=" + TRANSACTION_ID;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<String> httpEntity = new HttpEntity<>(value, headers);
        HttpEntity<String> response = restTemplate.exchange(URL, HttpMethod.POST, httpEntity, String.class);
        HttpHeaders responseHeaders = response.getHeaders();
        List<String> strings = responseHeaders.get(HttpHeaders.SET_COOKIE);
        System.out.println(strings);
        return strings;
    }

    public String sendAndRedirect(List<String> cookies) {
        String url = REDIRECT_URL + "?transactionId=" + TRANSACTION_ID;
        HttpHeaders headers = new HttpHeaders();
        cookies.forEach(cookie -> headers.add("Cookie", StringUtils.substringBefore(cookie, ";")));
        HttpEntity httpEntity = new HttpEntity<>(null, headers);
        System.out.println(httpEntity.getHeaders().get(HttpHeaders.SET_COOKIE));
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);
        String rss = response.getBody();
        System.out.println(response);
        return rss;
    }

    public String sendAndRedirect2(List<String> cookies) {
        String value = "transactionId=" + TRANSACTION_ID;
        HttpHeaders headers = new HttpHeaders();
        cookies.forEach(cookie -> headers.add("Cookie", cookie));
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity httpEntity = new HttpEntity<>(value, headers);
        System.out.println(httpEntity.getHeaders().get(HttpHeaders.SET_COOKIE));
        ResponseEntity<String> response = restTemplate.exchange(REDIRECT_URL, HttpMethod.POST, httpEntity, String.class);
        String rss = response.getBody();
        System.out.println(response);
        return rss;
    }

    public void stackExchange() {
        String url = "https://api.stackexchange.com/docs/sites#page=1&pagesize=8&filter=default&run=true";
        HttpEntity<String> exchange = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        System.out.println(exchange);
    }
}
