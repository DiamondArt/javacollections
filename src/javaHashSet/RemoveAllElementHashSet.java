package javaHashSet;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Write a Java program to remove all of the elements from a hash set
 * */
public class RemoveAllElementHashSet {
    public static void main(String[] args) {
        HashSet hashSetTwo = new HashSet<>(Arrays.asList("Hello world","45"));
        removeAllElement(hashSetTwo);
    }
    public static boolean removeAllElement(HashSet hashSetList){
        return hashSetList.removeAll(hashSetList);
    }
}
