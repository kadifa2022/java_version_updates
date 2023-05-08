package com.cydeo.streamPratice.dishTask;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll() {// returning stream directly
        return Stream.of(
                new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("123456", "39939339")),
                new Employee(101, "Ozzy", "ozzy@cydeo.com", Arrays.asList("123459", "39939333")),
                new Employee(102, "Peter", "peter@cydeo.com", Arrays.asList("123458", "39939320")),
                new Employee(103, "Sara", "sara@cydeo.com", Arrays.asList("123454", "399393312"))
                );
    }
}
