package javaHashSet;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Write a Java program to test a hash set is empty or not
 * */
public class IsEmptyHashSet {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet<>(Arrays.asList(2,"Hello world",45));
        System.out.println(isEmptyHashSet(hashSet));

    }
    public static boolean isEmptyHashSet(HashSet list) {
        return list.isEmpty();
    }
}
