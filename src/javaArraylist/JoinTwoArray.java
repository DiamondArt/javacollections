package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Write a Java program to join two array lists.
 * */
public class JoinTwoArray {
    public static void main(String[] args) {

        ArrayList<String> stringArrayOne = new ArrayList<>(Arrays.asList("Helo","Hi","Blabla","Love","Nice"));
        ArrayList<Integer> arrayNumberOne = new ArrayList<>(Arrays.asList(12,65,55,22,89));

        List arr = joinArray(stringArrayOne, arrayNumberOne);
        System.out.println(arr);
    }

    public static List joinArray(List array1, List array2) {
        List array3 = new ArrayList<>();
        Collections.sort(array2);
        array3.addAll(array1);
        array3.addAll(array2);

        return array3;
    }
}
