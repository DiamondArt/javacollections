package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a Java program to remove the third element from a array list.
 * */
public class RemoveItemArrayByIndex {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red","Pink","Blue","Brown","Green","Gray"));
        System.out.println(colors);
        colors.remove(3);
        System.out.println(colors);
        colors.remove("Blue");
        System.out.println(colors);
        colors.removeAll((Arrays.asList("Green","Gray")));
        System.out.println(colors);

    }
}
