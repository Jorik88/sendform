package com.example.sendform.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private String email;
    private String sureName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(sureName, user.sureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sureName);
    }
}
