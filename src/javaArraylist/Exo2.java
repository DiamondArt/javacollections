package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a Java program to iterate through all elements in a array list
 * */
public class Exo2 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Yellow")); //method1
        ArrayList<String> colorsTwo = new ArrayList<>(Arrays.asList("Orange","Pink", "Black"));

        System.out.println("------------- indexed boucle for ----------------------");
        for (int index = 0; index < colors.size(); index++) {
            System.out.println(index+1 +": "+colors.get(index));
        }

        System.out.println("------------- no indexed boucle for ----------------------");
        for(String ele: colorsTwo) {
            System.out.println(ele);
        }
        System.out.println("------------- foreach boucle on array ----------------------");
        colors.forEach((n) -> {
            System.out.println(n);
        });


    }
}
