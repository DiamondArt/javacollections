package javaArraylist;

import java.util.*;

/**
 * Write a Java program to clone an array list to another array list
 * */
public class CloneArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arrayNumberOne = new ArrayList<>(Arrays.asList(12,65,55,22,89));

        List arr = cloneArray(arrayNumberOne);
        System.out.println(arr);
    }
    public static List cloneArray(ArrayList arr) {
        List emptyArr =  (ArrayList<Object>)(arr.clone());
        return emptyArr;
    }
}
