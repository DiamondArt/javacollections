package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a Java program to create a new array list, add some colors (string) and print out the collection
 * */
public class Exo1 {
    public static void main(String[] args) {
        // method one
        List<String> myList = new ArrayList<>(Arrays.asList("Red","Blue","Yellow","Pink"));
        ArrayList<String> arrayOne = new ArrayList<String>(myList);
        System.out.println(arrayOne);

        //method two
        ArrayList<String> arrayTwo = new ArrayList<String>(myList);
        arrayTwo.add("Brown");
        arrayTwo.add("Blue");
        arrayTwo.add("Orange");
        System.out.println(arrayTwo);

    }


}
