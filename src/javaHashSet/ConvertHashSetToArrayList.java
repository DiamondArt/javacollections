package javaHashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Write a Java program to convert a hash set to a List/ArrayList
 * */
public class ConvertHashSetToArrayList {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet<>(Arrays.asList("2","Hello world","45"));
        System.out.println(convertHashToArrayList(hashSet));
    }
    public static ArrayList convertHashToArrayList(HashSet list) {
        return new ArrayList<>(list.stream().toList());
    }
}
