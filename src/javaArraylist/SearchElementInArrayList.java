package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a Java program to search an element in an array list
 * */
public class SearchElementInArrayList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red","Pink","Blue"));
        colors.forEach((el) -> {
            if (el.contains("Blue")) {
                System.out.println(el);
                return;
            }
            System.out.println("Element not found");
        }) ;

    }
}
