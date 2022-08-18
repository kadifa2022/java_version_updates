package com.cydeo.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {


    public static void main(String[] args) { //6 main methode and create sample date//objects

        Person p1 = new Person("Mike", 25, Gender.MALE);
        Person p2 = new Person("Ozzy",35,Gender.MALE);
        Person p3 = new Person("Tom", 23,Gender.MALE);
        Person p4 = new Person("Ally", 19,Gender.FEMALE);

        //6a create list
        List<Person> personList = Arrays.asList(p1,p2,p3,p4);

        //9 return boolean checkMember - Interface
        CheckMember checkMember = p -> p.getGender()==Gender.MALE && p.getAge() >=18 && p.getAge()<=25;

        //10
        print(personList,checkMember);

            //same thing as #9 just passing directly action --lambda--implementation of test method
         print(personList,p -> p.getGender()==Gender.MALE && p.getAge() >=18 && p.getAge()<=25);





    }
    // 7 create methode
    private static void print(List<Person> personList, CheckMember checkMember){

       //8 create list and forEach loop and if statement

        List<Person>result = new ArrayList<>();
        for (Person person:personList) {
            if(checkMember.test(person)){
                result.add(person);
            }
        }
        System.out.println(result);

    }
}
