package com.example.sendform.controller;

import com.example.sendform.model.ActualPrivilegedCategoriesRequest;
import com.example.sendform.model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class UserRestController {

    @GetMapping(value = "/user", produces = MediaType.APPLICATION_XML_VALUE)
    public User getUser() {
        User user = new User();
        user.setName("Vova");
        user.setLastName("Ivanov");
        user.setEmail("ivanov@gmail.com");
        user.setYear(44);
        return user;
    }

    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public ActualPrivilegedCategoriesRequest getXml() {
        ActualPrivilegedCategoriesRequest request = new ActualPrivilegedCategoriesRequest();
        request.setFirstname("Vova");
        request.setLastname("Makarov");
        request.setMiddlename("Vladimirovich");
        request.setDoctype(new BigInteger("23423"));
        request.setDocSerie("km");
        request.setDocNumber("4234");
        request.setLgotakat("Handicaped");
        request.setSnils("4234234");
        return request;
    }
}
