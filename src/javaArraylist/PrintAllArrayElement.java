package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write a Java program to print all the elements of a ArrayList using the position of the elements
 * */
public class PrintAllArrayElement {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("Hello","Hi","Blabla","Love","Nice"));
        printElement(stringArray);

    }
    public static void printElement(ArrayList arr) {
        for(int index = 0; index < arr.size(); index++) {
            System.out.println("Item "+ index + " = "+ arr.get(index));
        }
    }
}
