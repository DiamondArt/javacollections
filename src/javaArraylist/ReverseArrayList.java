package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Write a Java program to reverse elements in an array list
 * */
public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("Hello","Hi","Blabla","Love","Nice"));
        ArrayList<Integer> arrayNumber = new ArrayList<>(Arrays.asList(12,65,55,22,89));

        System.out.println("\n+++++++++++ REVERSE STRING ARRAY ++++++++++++++");
           reverseArray(stringArray);
        System.out.println("\n+++++++++++++++++ REVERSE INTEGER ARRAY ++++++++++++++++++ ");
          reverseArray(arrayNumber);
    }

    public static void reverseArray(ArrayList array){
        Collections.sort(array);
        Collections.reverse(array);
        System.out.println(array);
    }
}
