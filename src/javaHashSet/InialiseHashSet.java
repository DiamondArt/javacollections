package javaHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *  Write a Java program to append the specified element to the end of a hash set
 * */
public class InialiseHashSet {

    public static void main(String[] args) {
        List myhash =  Arrays.asList("Hello","Guten tag","Akwaba");
        System.out.println(appendElement(myhash));
    }
    public static HashSet appendElement(List liste) {
        return new HashSet(liste);
    }
}
