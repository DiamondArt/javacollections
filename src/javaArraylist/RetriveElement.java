package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list.
 * */
public class RetriveElement {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red","Orange","Blue"));
        System.out.println(colors.get(2));
    }
}
