package com.example.sendform;

import com.example.sendform.model.User;
import com.example.sendform.service.UserService;
import org.junit.Test;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBException;
import java.io.StringReader;

public class UserServiceTest {

    private UserService userService = new UserService();


    @Test
    public void testCheck() throws JAXBException {
        userService.check();
    }

    @Test
    public void unmarshal() {
        String s = "<user>\n" +
                "<name>Vova</name>\n" +
                "<lastName>Ivanov</lastName>\n" +
                "<last>fdgfddf</last>\n" +
                "<year>44</year>\n" +
                "<email>ivanov@gmail.com</email>\n" +
                "</user>";
        User unmarshal = JAXB.unmarshal(new StringReader(s), User.class);
        System.out.println(unmarshal);
    }
}
