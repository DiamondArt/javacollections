package javaHashSet;

import java.util.Arrays;
import java.util.HashSet;

/***
 * Write a Java program to iterate through all elements in a hash list
 * */
public class IterateHashList {
    public static void main(String[] args) {

        HashSet<String> hastList = new HashSet<>(Arrays.asList("Python","Java","Go lang","Pandas library"));
        hastList.forEach((element -> {
            System.out.println(element);
        }));

        //or
        System.out.println("================= OR ==================");
        for (String el: hastList) {
            System.out.println(el);
        }

    }
}
