package com.example.sendform.service;

import com.example.sendform.model.LiqPayPaymentResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Base64;
import static com.liqpay.LiqPayUtil.base64_encode;
import static com.liqpay.LiqPayUtil.sha1;

@Service
public class LiqPayService {

    private static final String PRIVATE_KEY = "GmKnyfLQ8jOWe2TZZi2oXMF63NWeaEicUxIsA3Az";
    private ObjectMapper objectMapper = new ObjectMapper();

    public void m1(HttpServletRequest request) throws IOException {
        String data = request.getParameter("data");
        LiqPayPaymentResponse response = objectMapper.readValue(new String(Base64.getDecoder().decode(data)), new TypeReference<LiqPayPaymentResponse>() {});
        System.out.println(response);
    }

    private String createSignature(String base64EncodedData) {
        return base64_encode(sha1(PRIVATE_KEY + base64EncodedData + PRIVATE_KEY));
    }
}
