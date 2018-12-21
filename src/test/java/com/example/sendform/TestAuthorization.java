package com.example.sendform;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAuthorization {

    private RestTemplate restTemplate = new RestTemplate();

    @Test
    public void test() {
        String token = "eyJhbGciOiJSUzUxMiJ9.eyJncm91cHMiOlsiVVNFUiJdLCJleHAiOjE1NDQ1NjA0NDUsInVzZXJJZCI6MTEzMDR9.SP9H-jGIQBWvaKDbElzfytb2Sa8nQkfI5w5w-aUP_zX4ntcyodH4c5XW8OKWdnGyCqkdx-cxVKCGzEpkGQEOdLxT9J2OQgGP-loP_SIG1DXtoUicZ84bxlQvqm2nWlWsf5xxWzrD560iQoYcNX6ae7FrbjMOWX3b3UokqQPrta9JbMRN_jBie_et-lZJskkYR4uoZmhhvYk-Ska5rDYxDvk-zlzeXGPowsma_-Rs2cFJ0I6DxKTGKExX8c-XROU5XXSbSMz7Vk2pLT__SVpMRhKkNjWwVYicj2_evsVy3oWIPN9Rd_eyghIwv6Eq-TArXGOVIeJdDWR7y8fv1EgjTA";

        String url = "https://auth.ex-crypto.me:8443/api/v1/users/11355/block";

        UriComponentsBuilder uri = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("value", false);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", token);
        headers.set("x-api-key", "999");

        HttpEntity entity = new HttpEntity<>(null, headers);

        ResponseEntity response = restTemplate.exchange(uri.toUriString(), HttpMethod.PUT, entity, String.class);
        System.out.println(response);
    }
}
