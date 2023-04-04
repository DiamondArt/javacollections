package javaArraylist;

import java.util.*;

/**
 * Write a Java program to sort a given array list
 * */
public class SortArray {

    public static void main(String[] args) {
        ArrayList<Integer> arrayNumbers = new ArrayList<>(Arrays.asList(80,100,23,45,67,87,90));
        ArrayList<String> arrayStrings = new ArrayList<>(Arrays.asList("Bonjour","Hi","Hello","Guten tag"));
        System.out.println("SORT INTEGER ARRAY");
        sortArray(arrayNumbers);
        System.out.println("SORT STRING ARRAY");
        sortArray(arrayStrings);
    }
    public static void sortArray(List myArray) {
        Collections.sort(myArray);

        System.out.println(myArray);
    }
}
