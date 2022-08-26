package com.cydeo.selfPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){

        return Stream.of(
                new Employee(100, "Mike", "Mike@cydeo.com", Arrays.asList("2626266262","282828288")),
                new Employee(101,"Ozzy", "Ozzy@cydeo.com", Arrays.asList("63553535355","525555252")),
                new Employee(102, "Peter", "Peter@cydeo.com", Arrays.asList("888883636","434343443"))
                );
    }




}
