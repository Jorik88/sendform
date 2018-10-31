package com.example.sendform.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class SendController {

    private static final String TRANSACTION_ID = "bbb83cbb-5c9f-4150-b1d0-3f0cb1ed659c";
    private static final String AUTHORISATION_URL = "https://localhost:9000/api/processing/process";
    private static final String PUBLIC_KEY = "i77403547665";
    private static final String PRIVATE_KEY = "GmKnyfLQ8jOWe2TZZi2oXMF63NWeaEicUxIsA3Az";
    private ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping(value = "/send")
    public String sendForm(Model model) {
        model.addAttribute("authorisationUrl", AUTHORISATION_URL);
        model.addAttribute("transactionId", TRANSACTION_ID);
        return "index";
    }


    @GetMapping(value = "/hello")
    public String hello() {
        return"liqpay";
    }

    @PostMapping(value = "/api/input/payment/{paymentSystem}")
    public ResponseEntity handlePaymentResponse(@PathVariable String paymentSystem, HttpServletRequest request) throws IOException {
        System.out.println(request);
        return ResponseEntity.ok().build();
    }
}
