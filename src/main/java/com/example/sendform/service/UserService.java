package com.example.sendform.service;

import com.example.sendform.model.User;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Service
public class UserService {

    public void check() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        User user = (User) jaxbUnmarshaller.unmarshal(new File("/home/jorik/Examples App/sendform/src/test/resources/aml2.xml"));
        System.out.println(user);
    }
}
