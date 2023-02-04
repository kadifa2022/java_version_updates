package com.cydeo.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        //
        users.add(new User("Mike", "Smith", 35));
        users.add(new User("Tom", "Evan", 25));
        users.add(new User("Emma", "Pollard", 55));


        //print all elements  in the list//it's true because we don't have any restriction
        printName(users, user -> true);


        //print all users that last name starts with E
        // lambda --passing action
        printName(users, user -> user.getLastName().startsWith("E"));


    }

    private static void printName(List<User> users, Predicate<User> p) { //1.methode ( list  user, interface Predicate<User>P
        for (User user : users) {//check all users
            if (p.test(user)) {//means test() methode
                System.out.println(user.toString());
            }
        }
    }
}