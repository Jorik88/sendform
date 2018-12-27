package com.example.sendform;

import com.example.sendform.entity.User;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestUser {

    @Test
    public void test() {
        List<User> list = Arrays.asList(new User("vova", "vovf@compareXml", "petrov"), new User("jora", "jora@", "sidorov"));

//        List<User> list1 = Arrays.asList(new User("jora", "jora@", "sidorov"));
        List<User> list1 = Collections.singletonList(new User("vova", "w@compareXml", "petrov"));

        System.out.println(list.equals(list1));

    }
}
