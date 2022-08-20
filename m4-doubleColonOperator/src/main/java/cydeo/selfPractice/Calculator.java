package cydeo.selfPractice;

public class Calculator {

    public static void findSum(int x, int y){//static methode
        System.out.println("Sum " + (x + y));

    }

    public  void findMultiply(int x, int y){//instants  methode can call through creating object
        System.out.println("Multiply" + ( x * y));
    }



}
