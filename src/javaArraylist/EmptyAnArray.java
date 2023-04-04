package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a Java program to empty an array list
 * */
public class EmptyAnArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayNumberOne = new ArrayList<>(Arrays.asList(12,65,55,22,89));
        System.out.println("================ Array before empty function");
        System.out.println(arrayNumberOne);
        System.out.println("================ Array after empty function");

        emptyArray(arrayNumberOne);
    }

    public static void emptyArray(List arr) {
         arr.removeAll(arr);
        System.out.println(arr);
    }
}
