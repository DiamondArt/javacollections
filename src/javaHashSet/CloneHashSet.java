package javaHashSet;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Write a Java program to clone a hash set to another hash set
 * */
public class CloneHashSet {
    public static void main(String[] args) {
        HashSet defaultHash = new HashSet(Arrays.asList("Bonjour",78, 90, "Hello"));
        System.out.println(cloneHashSet(defaultHash));
    }
    public static HashSet cloneHashSet(HashSet has) {
        return (HashSet) has.clone();
    }
}
