package com.cydeo.streamPratice.dishTask;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeTest {
    public static void main(String[] args) {

        // print all emails

        EmployeeData.readAll()
                // .map(employee->employee.getEmpEmail())// with lambda
                .map(Employee::getEmpEmail)// with double collen operator // calling directly from static class
                .forEach(System.out::println);

        System.out.println("------------print all phone numbers with flapMap -------------");

        EmployeeData.readAll()
        //we can use :: collen operator when lambda call methods directly
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())// flatMap always accept stream of stream
                .forEach(System.out::println);

        System.out.println("------------print all phone numbers with flapMap with double collen operator -------------");

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)// pass List from EmplopyeeData
                .forEach(System.out::println);


      // we can use :: collen operator when lambda call methods directly

      //   declarative / functional








    }
}
