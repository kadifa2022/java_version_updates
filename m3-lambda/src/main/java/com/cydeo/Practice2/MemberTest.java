package com.cydeo.Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {

        Person p1 = new Person("Mike", 35 , Gender.MALE);
        Person p2 = new Person("Tina", 15 , Gender.FEMALE);
        Person p3 = new Person("Dino", 45 , Gender.MALE);
        Person p4 = new Person("Emina", 22 , Gender.FEMALE);

        List<Person> personList = Arrays.asList(p1,p2,p3,p4);

        CheckMember checkMember=p->p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge()<=25;
        print(personList, checkMember);

        print(personList, p -> p.getGender()==Gender.FEMALE && p.getAge()>=18 && p.getAge()<=25);


    }
    private static void print(List<Person> personList, CheckMember checkMember){

        List<Person> result = new ArrayList<>();
        for(Person person: personList){
            if(checkMember.test(person)){
                result.add(person);
            }
        }
        System.out.println(result);

    }

}
