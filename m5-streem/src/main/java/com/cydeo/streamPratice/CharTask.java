package com.cydeo.streamPratice;

import java.util.Arrays;
import java.util.List;

public class CharTask {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java","Apple", "Honda","Developer");

        words.stream().map(str->str.length())
                .forEach(System.out::println);


    }


}
