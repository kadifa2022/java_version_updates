package com.cydeo.task;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        //print all emails
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)//double colon operator
                // .map(employee->employee.getEmpEmail())
                .forEach(System.out::println);

        System.out.println("-------------print all phone numbers-----------------"); //flat always accept stream of stream

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);


        System.out.println("----------print all phone numbers with double colon operator----------");

        EmployeeData.readAll()//IF LAMBDA CALLING METHODE DIRECTLY you can use double colon operator
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}