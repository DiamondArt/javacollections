package javaHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Write a Java program to convert a hash set to a tree set
 * */
public class ConvertHashSetToTreeSet {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet<>(Arrays.asList("2","Hello world","45"));
        System.out.println(convertToTreeSet(hashSet));
    }

    public static TreeSet convertToTreeSet(HashSet list) {
        return new TreeSet(list);
    }
}
