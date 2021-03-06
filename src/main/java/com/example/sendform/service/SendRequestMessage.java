package com.example.sendform.service;

import com.example.sendform.configuration.BepaidConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Slf4j
@Service
public class SendRequestMessage {

    private RestTemplate restTemplate = new RestTemplate(SSLClientFactory.getClientHttpRequestFactory(SSLClientFactory.HttpClientType.HttpClient));

    private static final String URL = "https://localhost:9000/api/processing/process";
    private static final String TRANSACTION_ID = "a7e01361-9163-4b67-953e-73983fc87f47";
    private static final String REDIRECT_URL = "https://localhost:9000/api/processing/status";

    @Autowired
    private BepaidConfiguration bepaidConfiguration;

    public List<String> send1() {
        String value = "transactionId=" + TRANSACTION_ID;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED);
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
        cookies.forEach(cookie -> headers.add(HttpHeaders.COOKIE, StringUtils.substringBefore(cookie, ";")));
        HttpEntity httpEntity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response;
        int attemptCount = 0;
        try{
            while (true) {
                attemptCount++;
                response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
                if(response.getStatusCode().equals(HttpStatus.SEE_OTHER)){
                    break;
                }else if (attemptCount > bepaidConfiguration.getAttemptCount()){
                    log.warn("Attempt count limit, count is={}", attemptCount);
                    throw new IllegalArgumentException("Attempt count limit, count is " + attemptCount);
                }else {
                    Thread.sleep(2000);
                }
            }
            HttpHeaders responseHeaders = response.getHeaders();
            List<String> location = responseHeaders.get("Location");
            if (location == null || location.isEmpty()) {
                log.warn("Header Location not found or not contain data");
                throw new IllegalArgumentException("Header Location not found or not contain data");
            }
            log.warn("Response={}", response.getHeaders().toString() + response.getStatusCode());
            return StringUtils.substringAfterLast(location.get(0), "&");
        }catch (Exception e) {
           throw new IllegalArgumentException(e);
        }
    }

    public String sendAndRedirect2(List<String> cookies) {
        String value = "transactionId=" + TRANSACTION_ID;
        HttpHeaders headers = new HttpHeaders();
        cookies.forEach(cookie -> headers.set(HttpHeaders.COOKIE, StringUtils.substringBefore(cookie, ";")));
        headers.setContentType(org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity httpEntity = new HttpEntity<>(value, headers);
        log.warn("List of cookies={}", httpEntity.getHeaders().get(HttpHeaders.SET_COOKIE));
        ResponseEntity<String> response = restTemplate.exchange(REDIRECT_URL, HttpMethod.POST, httpEntity, String.class);
        String rss = response.getBody();
        log.warn("Response={}", response);
        return rss;
    }

//    public String sendFormInsomniaKeys(List<String> cookies) throws IOException, KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
//        String url = REDIRECT_URL + "?transactionId=" + TRANSACTION_ID;
//        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
//        HttpClient instance = HttpClientBuilder.create().disableRedirectHandling().build();
//        factory.setHttpClient(instance);
//        restTemplate.setRequestFactory(factory);
//        HttpHeaders headers = new HttpHeaders();
//        cookies.forEach(cookie -> headers.add(HttpHeaders.COOKIE, StringUtils.substringBefore(cookie, ";")));
//        HttpEntity httpEntity = new HttpEntity<>(null, headers);
//        log.warn("List of cookies={}", httpEntity.getHeaders().get(HttpHeaders.COOKIE));
//        ResponseEntity<String> response = null;
//        int count = 0;
//        try{
//            while(true) {
//                count++;
//                System.out.println("BEFORE REQUEST NUMBER " + count + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//                response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
//                System.out.println("AFTER REQUEST >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//                System.out.println(response.getHeaders() + " " +  response.getStatusCode() + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//                if (response.getStatusCode().equals(HttpStatus.SEE_OTHER)) {
//                    System.out.println("303 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//                    break;
//                }
//            }
//            System.out.println("OUT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//            String rss = response.getBody();
//            log.warn("Response={}", response);
//            log.warn("Response body={}", response.getBody() + response.getStatusCode());
//            return rss;
//        }catch (Exception e) {
//            System.out.println("CATCH >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//            return response.getHeaders().toString();
//        }
////        HttpGet request = new HttpGet(url);
////        cookies.forEach(cookie -> request.addHeader(HttpHeaders.COOKIE, StringUtils.substringBefore(cookie, ";")));
////        HttpResponse response = null;
////        int count = 0;
////        while(true) {
////            count++;
////            System.out.println("REQUEST NUMBER " + count);
////            response = instance.execute(request);
////            System.out.println("AFTER REQUEST NUMBER " + count);
////                if (response.getStatusLine().getStatusCode() == 303) {
////                    System.out.println("303 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
////                    break;
////                }
////        }
////        return response.toString();
//    }


    //    private List<String> sendHtmlFormForConfirmEnrolment(String transactionId) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(APPLICATION_FORM_URLENCODED);
//        HttpEntity<String> httpEntity = new HttpEntity<>("transactionId=" + transactionId, headers);
//        HttpEntity<String> response = restTemplate.exchange(CONFIRM_ENROLMENT_PROCESS_URL, HttpMethod.POST, httpEntity, String.class);
//        HttpHeaders responseHeaders = response.getHeaders();
//        List<String> cookies = responseHeaders.get(HttpHeaders.SET_COOKIE);
//        if (cookies == null || cookies.isEmpty()) {
//            log.warn("Cookies not found in response");
//            throw new BepaidException("Cookies not found in response");
//        }
//        return cookies;
//    }
//
//    private void sendHtmlFormWithCookies(List<String> cookiesList, String transactionId) throws InterruptedException {
//        String url = CONFIRM_ENROLMENT_STATUS_URL + "?transactionId=" + transactionId;
//        HttpHeaders headers = new HttpHeaders();
//        cookiesList.forEach(cookie -> headers.add(HttpHeaders.COOKIE, StringUtils.substringBefore(cookie, ";")));
//        HttpEntity httpEntity = new HttpEntity<>(null, headers);
//        ResponseEntity<String> response;
//        int attemptCount = 0;
//            while (true) {
//                attemptCount++;
//                response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
//                if(response.getStatusCode().equals(HttpStatus.SEE_OTHER)){
//                    break;
//                }else if (attemptCount > bepaidConfiguration.getRequestAttemptCount()){
//                    log.warn("Attempt count limit, count is={}", attemptCount);
//                    throw new BepaidException("Attempt count limit, count is " + attemptCount);
//                }else {
//                    Thread.sleep(2000);
//                }
//            }
//            HttpHeaders responseHeaders = response.getHeaders();
//            List<String> location = responseHeaders.get("Location");
//            if (location == null || location.isEmpty()) {
//                log.warn("Header Location not found or not contain data");
//                throw new BepaidException("Header Location not found or not contain data");
//            }
//        boolean status = Boolean.valueOf(StringUtils.substringAfterLast(location.get(0), "="));
//        if (!status) {
//            log.warn("Enrolment operation is failed");
//            throw new BepaidException("Enrolment operation is failed");
//        }
//    }

    public void stackExchange() {
        String url = "https://api.stackexchange.com/docs/sites#page=1&pagesize=8&filter=default&run=true";
        HttpEntity<String> exchange = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        System.out.println(exchange);
    }
}
