package com.cydeo.java9;

import java.util.List;

public class ModuleDemo {

    public static void main(String[] args) {
        System.out.println(String.class.getModule());
        System.out.println(List.class.getModule());
        System.out.println(String.class.getModule());
        System.out.println(String.class.getModule());
    }
}
