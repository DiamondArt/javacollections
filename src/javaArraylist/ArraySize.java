package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write a Java program to trim the capacity of an array list the current list size
 * */
public class ArraySize {
    public static void main(String[] args) {

        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("Hello"," Hello ","Hi","Blabla","Love","Nice"));

        System.out.println("Original array list");
        System.out.println(stringArray);
        System.out.println("Let trim to size the above array: ");
        arraySize(stringArray);
    }

    public static Object arraySize(ArrayList arr) {
        arr.trimToSize();
        System.out.println(arr);
        return null;
    }
}
