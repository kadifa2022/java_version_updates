package com.cydeo.selfPractice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationsDemo {

    public static void main(String[] args) {

        //distinct(): returns the distinct elements in the stream after eliminating the duplicates

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,6,7));

        list1=list1.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);

        //Limit(n): returns the elements in stream after skipping the first elements
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,6,7));

        list2=list2.stream().skip(5).collect(Collectors.toList());
        System.out.println(list2);

        //limit(n): returns first (n) elements in the stream

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,6,7));

        list3=list3.stream().limit(5).collect(Collectors.toList());
        System.out.println(list3);

        //map(function):transforming the elements in the stream by applying specified function

        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,6,7));

        list4=list4.stream().map(p->{if (p%2!=0)return p*2; else return p;} ).collect(Collectors.toList());

        System.out.println(list4);

        //filter(Predicate)-predicate is interface that return type of abstract methode is boolean

        List<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,6,7));
        list5=list5.stream().filter(p->p%3==0).collect(Collectors.toList());
        System.out.println(list5);

        //sorted(): sorting elements in stream

        List<Integer> list6 = new ArrayList<>();
        list6.addAll(Arrays.asList(10,13,1,222,2,20,3,23,32,42,4,44,5,05,62,64,62,7));
        list6=list6.stream().sorted().collect(Collectors.toList());
        System.out.println(list6);

        //peek(Consumer):returns the elements in the stream after performing the specified operations on each element

        List<Integer> list7 = new ArrayList<>();
        list7.addAll(Arrays.asList(11,15,17,28,29,32,33,53,36,74,4,48,58,50,60,60,6,7));

        list7=list7.stream().filter(p->p %5==0).peek(p-> System.out.println(p)).collect(Collectors.toList());
        System.out.println(list7);

        System.out.println("-------------------------------------");
        //1. Eliminate duplicates
        //2. find the string that starts with "J" ONLY
        //3. Converts them all to upper letter
        //store them into new list

        List<String> words= new ArrayList<>();
        words.addAll(Arrays.asList("Java", "JavaScript", "Python", "Java", "C#", "JavaScript", "Python", "Java", "C#", "JavaScript"));

        words=words.stream().distinct().filter(p->p.startsWith("J")).map(p->p.toUpperCase()).collect(Collectors.toList());

        System.out.println(words);



    }

}
