package com.cydeo.task;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor//3
@Getter
@Setter
@ToString

public class Person { //1

    private String name;

    private int age;

    private Gender gender;//2 enum class

   // private String emailAddress;


}
