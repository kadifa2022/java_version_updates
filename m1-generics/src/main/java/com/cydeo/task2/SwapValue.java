package main.java.com.cydeo.task2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SwapValue {
    public static void main(String[] args) {
        Integer [] a= {1,2,3,4};

        swap(a,0,2);
        System.out.println(Arrays.toString(a));
    }

    public static  <T>  void swap( T [] a, int i, int j ){
      T temp = a[i];
      a[i] = a[j];
      a[j] = temp;

    }





}
/*
Write a generic methode to exchange the positions of two different elements in array.
sample output:
Integer[] a = {1,2,3,4};
swap (a,0,2);
System.out.println(Arrays.toString(a));

 */