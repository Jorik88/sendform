package com.example.sendform;

import com.example.sendform.entity.User;
import com.example.sendform.entity.UserDto;
import org.junit.Test;
import org.springframework.beans.BeanUtils;

public class TestCopyUser {

//    Пример того как можно обходиться без создания конвертеров и проверок на null.
//    Здесь создаются два разных объекта, у которых есть одинаковые поля.
//    Одинаковые поля копируются, а те которые не совпадают инициализирутся дефолтным значением
//    которое зависит от типа переменной(String => null, boolean => false, int => 0, ...).
    @Test
    public void testCopy() {
        User user = new User("Vova", "vova@gmail.com", "Ivanov");
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user, userDto);
        System.out.println(userDto);
    }
}
