package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a Java program to extract a portion of an array list.
 * */
public class ExtractPortionArrayList {

    public static void main(String[] args) {

        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("Hello","Hi","Blabla","Love","Nice"));
        ArrayList<Integer> arrayNumber = new ArrayList<>(Arrays.asList(12,65,55,22,89));

        System.out.println("\n+++++++++++ Extract STRING ARRAY ++++++++++++++");
        System.out.println(stringArray);
        System.out.println(extractArrayPortion(stringArray));

        System.out.println("\n+++++++++++ Extract STRING ARRAY ++++++++++++++");
        System.out.println(arrayNumber);
        System.out.println(extractArrayPortion(arrayNumber));

    }

    public static List extractArrayPortion(ArrayList array) {
        return array.subList(0,3);
    }
}
