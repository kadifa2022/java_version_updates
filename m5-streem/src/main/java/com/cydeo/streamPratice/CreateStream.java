package com.cydeo.streamPratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) { // creating stream from collection

        // Creating stream from Array
        String[] courses= {"Java", "Spring ", "Agile"};
        Stream<String> courseStream = Arrays.stream(courses);

        //Creating Stream from collection
        List<String> courseList = Arrays.asList("Java", "Spring", "Agile");
        Stream<String> coursesStream2 = courseList.stream();

        // Creating stream from class (sources)

        List<Course> myCourse= Arrays.asList(
                new Course("Java", 100),
                new Course("DS", 101),
                new Course("MS", 102)
        );
        //  converting to stream
        Stream<Course> myCoursesStream =  myCourse.stream();

        //Creating stream Values
        Stream<Integer> stream =Stream.of(1,2,3,4);  // another way of creating stream ()




    }
}
