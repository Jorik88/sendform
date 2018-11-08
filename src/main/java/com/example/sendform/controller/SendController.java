package com.example.sendform.controller;

import com.example.sendform.service.LiqPayService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;

@Controller
public class SendController {

    private static final String TRANSACTION_ID = "1ba18cd3-f064-4dfa-b62b-47a93833fc74";
    private static final String AUTHORISATION_URL = "https://localhost:9000/api/processing/process";
    private static final String PUBLIC_KEY = "i77403547665";
    private static final String PRIVATE_KEY = "GmKnyfLQ8jOWe2TZZi2oXMF63NWeaEicUxIsA3Az";
    private ObjectMapper objectMapper = new ObjectMapper();


    @Autowired
    private LiqPayService service;

    @GetMapping(value = "/send")
    public String sendForm(@RequestParam String transactionId, Model model) {
        model.addAttribute("authorisationUrl", AUTHORISATION_URL);
        model.addAttribute("transactionId", transactionId);
        return "index";
    }


    @GetMapping(value = "/hello")
    public String hello() {
        return"liqpay";
    }

    @GetMapping(value = "/api/input/payment/LiqPay/{userId}")
    public ResponseEntity handlePaymentResponse(@PathVariable String userId, HttpServletRequest request) {
//        System.out.println(request);
//        service.m1(request);
        System.out.println("hello");
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/input")
    public String inputForm() {
        return "bepaidINPUT";
    }
}
