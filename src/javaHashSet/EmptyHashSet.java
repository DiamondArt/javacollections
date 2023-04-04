package javaHashSet;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Write a Java program to empty a hash set
 * */
public class EmptyHashSet {
    public static void main(String[] args) {
        HashSet<String> hastList = new HashSet<>(Arrays.asList("Python","Java","Go lang","Pandas library"));

        System.out.println("Hash list before remove: "+ hastList);
        hastList.removeAll(hastList);
        System.out.println("After remove all element "+ hastList);
    }
}
