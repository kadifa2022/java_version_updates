package com.cydeo.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTask {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList.add(new User("Mike" ,"Smith" , 35));
        userList.add(new User("Tom", "Sevan", 23));
        userList.add(new User("Bella", "Lee", 20));

        // print all element in the list
        printName(userList, user -> true);
        // Print all people that last nae starts with M

        printName(userList, user -> user.getLastName().startsWith("M"));
    }
    //method
    public static void printName(List<User> userList, Predicate<User> p){
        List<User> result = new ArrayList<>();
        for (User user : userList) {
            if(p.test(user)){
                result.add(user);
                System.out.println(user.toString());

            }

        }
    }

}
