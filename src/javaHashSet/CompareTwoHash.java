package javaHashSet;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Write a Java program to compare two hash set
 * */
public class CompareTwoHash {
    public static void main(String[] args) {
        HashSet hashSetOne = new HashSet<>(Arrays.asList("2","Hello world","45"));
        HashSet hashSetTwo = new HashSet<>(Arrays.asList("Hello world","45"));

        System.out.println(compareTwoHashSet(hashSetOne, hashSetTwo));
    }
    public static HashSet compareTwoHashSet(HashSet hashOne, HashSet hashTwo) {
        HashSet hashThree = new HashSet();
        for (Object element : hashOne) {
            if(hashTwo.contains(element)) {
                hashThree.add(element);
            }
        }
        return hashThree;
    }
}
