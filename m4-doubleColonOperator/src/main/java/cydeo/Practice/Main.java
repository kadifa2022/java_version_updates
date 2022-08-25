package cydeo.Practice;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
                   //implementation for abstract methode, that belongs to functional interface -that comes from Java 8
                    //to be able to find Function Interface you need to look for methode SignatureS
                    // Methode Signature is accepting parameters and return type

       // Predicate<Integer> pred=(p)-> p%2==0? true:false;

        //function Interface(calculate)// //implementation for abstract methode, that belongs to functional interface
        Calculate sum = (x,y)-> System.out.println(x+y);

        //static methode calling through class name

        Calculate s1 = (x,y)->Calculator.findSum(x,y);
        //reference to static () //
        // calling through Class name-double colon operator and findSum()
        //if implementation is coming from method(findSum()) we can shorten
        Calculate s2 = Calculator::findSum;
        // how we test
        s2.calculate(20,40);

        //Reference to instant()
        // instant methode can't be called through class - we have to create Object

        Calculator obj= new Calculator();









    }


}
