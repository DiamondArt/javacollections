package javaHashSet;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Write a Java program to get the number of elements in a hash set
 * */
public class GetElementOfHashSet {
    public static void main(String[] args) {
        HashSet<String> hastList = new HashSet<>(Arrays.asList("Python","Java","Go lang","Pandas library"));
        System.out.println(hastList.size());
    }
}
