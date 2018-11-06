package com.example.sendform.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@Service
public class SendRequestMessage {

    private RestTemplate restTemplate = new RestTemplate(SSLClientFactory.getClientHttpRequestFactory(SSLClientFactory.HttpClientType.HttpClient));

    private static final String URL = "https://localhost:9000/api/processing/process";
    private static final String TRANSACTION_ID = "823470ac-9d28-4306-a70a-37ee561f0813";
    private static final String REDIRECT_URL= "https://localhost:9000/api/processing/status";
    private static final String OAUTH_TOKEN = "964932d6-d615-40ae-96f2-7eb2cede12ff";

    public List<String> send1() {
        String value = "transactionId=" + TRANSACTION_ID;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<String> httpEntity = new HttpEntity<>(value, headers);
        HttpEntity<String> response = restTemplate.exchange(URL, HttpMethod.POST, httpEntity, String.class);
        HttpHeaders responseHeaders = response.getHeaders();
        List<String> strings = responseHeaders.get(HttpHeaders.SET_COOKIE);
        log.warn("List of cookies={}", strings);
        return strings;
    }

    public String sendAndRedirect(List<String> cookies) {
        String url = REDIRECT_URL + "?transactionId=" + TRANSACTION_ID;
        HttpHeaders headers = new HttpHeaders();
        cookies.forEach(cookie -> headers.add(HttpHeaders.SET_COOKIE, cookie));
        HttpEntity httpEntity = new HttpEntity<>(null, headers);
        log.warn("List of cookies={}", httpEntity.getHeaders().get(HttpHeaders.SET_COOKIE));
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);
        String rss = response.getBody();
        log.warn("Response={}", response);
        return rss;
    }

    public String sendAndRedirect2(List<String> cookies) {
        String value = "transactionId=" + TRANSACTION_ID;
        HttpHeaders headers = new HttpHeaders();
        cookies.forEach(cookie -> headers.add(HttpHeaders.SET_COOKIE, cookie));
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity httpEntity = new HttpEntity<>(value, headers);
        log.warn("List of cookies={}", httpEntity.getHeaders().get(HttpHeaders.SET_COOKIE));
        ResponseEntity<String> response = restTemplate.exchange(REDIRECT_URL, HttpMethod.POST, httpEntity, String.class);
        String rss = response.getBody();
        log.warn("Response={}", response);
        return rss;
    }

    public void stackExchange() {
        String url = "https://api.stackexchange.com/docs/sites#page=1&pagesize=8&filter=default&run=true";
        HttpEntity<String> exchange = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        System.out.println(exchange);
    }
}
