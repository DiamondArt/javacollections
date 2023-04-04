package javaHashSet;

import java.util.Arrays;
import java.util.HashSet;

/***
 * Write a Java program to convert a hash set to an array
 * */
public class ConvertHashSetToArray {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet<>(Arrays.asList(2,"Hello world",45));
        cloneHashToArray(hashSet);
        for(Object element : hashSet){
            System.out.println(element);
        }
    }

    public static Object cloneHashToArray(HashSet list) {
        return list.toArray();
    }
}
