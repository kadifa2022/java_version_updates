package com.cydeo.task.personTast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {

        Person p1 = new Person("Mike", 20, Gender.MALE);
        Person p2 = new Person("Zora", 18, Gender.FEMALE);
        Person p3 = new Person("Tom", 45, Gender.MALE);
        Person p4 = new Person("Mia", 30, Gender.FEMALE);

        List<Person> personList= Arrays.asList(p1,p2,p3,p4);// adding to person list
        // behavior
        CheckMember checkMember = p -> p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge()<=25;
      // call method
        print(personList,checkMember);

        print(personList,p -> p.getGender()==Gender.MALE && p.getAge()>=18  && p.getAge()<=25);




    }

    // METHOD TO ACCEPT DIFFERENT BEHAVIORS
    private static void print(List<Person> personList, CheckMember checkMember){

        List<Person> result = new ArrayList<>();// creating bucket for result
        for(Person person : personList){ // checking each person
            if(checkMember.test(person)){//checking persons from interface
                result.add(person); // adding
            }
        }

        System.out.println(result);

     }



}
