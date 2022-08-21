package com.cydeo.task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CharStreamTask {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("JAVA","APPLE", "HONDA", "DEVELOPER");

      words.stream()
              .map(str-> str.length())
              .forEach(System.out::println);


      //practice
      //Arrays.stream()is used for creating stream from specified array - for example:
        String[] courses = {"Java", "TS","JS"};
       Stream<String> courseStream = Arrays.stream(courses);

       //Collection.stream()methode is used for creating a stream from collection -for example:
       List<String>courseList=Arrays.asList("JAVA","TS","JS");
       Stream<String> courseStream2 = courseList.stream();

       //Stream.of()is used for creating a stream with specific values-for Example
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
    }
}
