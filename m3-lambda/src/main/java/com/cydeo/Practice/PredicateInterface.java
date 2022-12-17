package com.cydeo.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {

    public static void main(String[] args) {

        Predicate<Integer> isEven= a-> a % 2 ==0;
        boolean r1 = isEven.test(200);
        System.out.println(r1);

        Predicate<String> isPalindrome = (str)-> {
            String reverse= "";
            for (int i = str.length()-1; i>=0; i--) {
                reverse += str.charAt(i);

            }
            boolean result = str.equalsIgnoreCase(reverse);
            return result;
        };
        boolean r2 = isPalindrome.test("Wooden Spoon");
        System.out.println(r2);

    }

}


