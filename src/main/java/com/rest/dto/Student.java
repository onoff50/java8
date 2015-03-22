package com.rest.dto;

/**
 * Created by neerajsi on 22/03/15.
 */

import lombok.Getter;
import lombok.Setter;



/**
 * Created by neerajsi on 21/03/15.
 */

@Getter
@Setter
public class Student {

    private int id;

    private int age;

    private String firstName;

    private String lastName;

    public Student() {
    }

    public Student(int id, int age, String firstName, String lastName) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

