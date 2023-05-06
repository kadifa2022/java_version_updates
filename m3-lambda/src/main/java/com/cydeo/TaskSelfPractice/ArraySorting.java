package com.cydeo.TaskSelfPractice;

public class ArraySorting {

    //quickSort, Bubble Sort

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        as.sort(qs);
        as.sort(bs);

        Sorting quickSort = () -> System.out.println("Quick sort");
        as.sort(quickSort);
        as.sort(() -> System.out.println("Quick sort"));


    }
     private  void sort(Sorting sorting){
         sorting.sort();
     }


}
