package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a Java program to update specific array element by given element.
 * */
public class UpdateArrayList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red","Pink","Purple"));

        System.out.println("\n============ Colors list before update ====================");
        System.out.println(colors);
        System.out.println("\n============= Colors list after update ====================");
        colors.set(2, "Orange");
        System.out.println(colors);
    }
}
