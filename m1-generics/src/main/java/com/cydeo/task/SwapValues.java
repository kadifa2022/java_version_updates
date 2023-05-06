package main.java.com.cydeo.task;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class SwapValues {

    public static void main(String[] args) {

        Integer [] a ={1,2,3,4};

        swap(a, 0,2);
        System.out.println(Arrays.toString(a));

    }
    private static <T>void swap(T[] a, int i, int j){
        //empty bucket
        T temp = a[i];
        a[i]= a[j];
        a[j]= temp;


    }


}
/*
Write a generic methode to exchange the positions of two different elements in array.
sample output:
Integer[] a = {1,2,3,4};
swap (a,0,2);
System.out.println(Arrays.toString(a));

 */