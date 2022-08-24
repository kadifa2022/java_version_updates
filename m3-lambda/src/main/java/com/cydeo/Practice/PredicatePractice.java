package com.cydeo.Practice;

import java.util.function.Predicate;

public class PredicatePractice {

    public static void main(String[] args) {

        //if is only one parameter and one statement we don't need any braces

        Predicate<Integer> isEven= a->  a %2 ==0;

       Boolean r1 =isEven.test(300);
        System.out.println(r1);

        Predicate<String> isPalindrome= (str)->{
            String reversed= "";
            for (int i = str.length()-1; i >=0 ; i--) {
                reversed += str.charAt(i);

            }
            boolean result= str.equalsIgnoreCase(reversed);
            return result;
        };
        Boolean r2=isPalindrome.test("Wooden Spoon");
        System.out.println(r2);

    }
}
