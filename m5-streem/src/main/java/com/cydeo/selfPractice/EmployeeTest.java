package com.cydeo.selfPractice;


import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        //print all emails

        EmployeeData.readAll()
                .map(Employee::getEmpEmail)//double colon operator
                //.map(employee->employee.getEmpEmail() )
                .forEach(System.out::println);

        System.out.println("----------print all phone numbers-----------");

        EmployeeData.readAll()          // flatMap because is stream of stream
                //.map(Employee::getEmpPhoneNumbers) //Employee
                .flatMap(employee-> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("----------print all phone numbers with double colon operator-----------");

        EmployeeData.readAll()//when lambda calling methode directly we can use double colon operator
                .map(Employee::getEmpPhoneNumbers)
                .flatMap( List::stream)//stream is methode
                .forEach(System.out::println);





    }




}
