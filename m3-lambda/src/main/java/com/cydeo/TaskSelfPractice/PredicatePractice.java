package com.cydeo.TaskSelfPractice;

import java.util.function.Predicate;

public class PredicatePractice { //java version 8

    public static void main(String[] args) {
        //predicate integer one parameter
        Predicate<Integer> isEven= a -> a % 2 == 0;// if is one argument no need () {}

        boolean r1 = isEven.test(300);
        System.out.println(r1);

        Predicate<String> isPalindrome= (str)->{
            String reverse ="";
            for (int i = str.length()-1; i >=0 ; i--) {
                reverse += str.charAt(i);

            }
            boolean result = str.equalsIgnoreCase(reverse);
            return result;

        };
        boolean r2 = isPalindrome.test("anavolimilovana");
        System.out.println(r2);





    }


}
