package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  Write a Java program to insert an element into the array list at the first position
 * */
public class InsertElementFirstPosition {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>(Arrays.asList("Red","Pink","Yellow"));
        colors.add(0,"Blue");
        System.out.println(colors);
    }
}
