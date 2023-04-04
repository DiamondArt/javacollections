package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Write a Java program to compare two array lists
 * */
public class CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringArrayOne = new ArrayList<>(Arrays.asList("Helo","Hi","Blabla","Love","Nice"));
        ArrayList<String> stringArrayTwo = new ArrayList<>(Arrays.asList("Hello","Hella","Blabla","Love","Nice"));

        ArrayList<Integer> arrayNumberOne = new ArrayList<>(Arrays.asList(12,65,55,22,89));
        ArrayList<Integer> arrayNumberTwo = new ArrayList<>(Arrays.asList(12,65,55,26,90));

        List<Integer> newArray =  compareArray(arrayNumberOne,arrayNumberTwo);
        List<String> newArrayTwo =  compareArray(stringArrayOne,stringArrayTwo);
        System.out.println(newArray);
        System.out.println(newArrayTwo);

    }

    public static List compareArray(List arrayOne, List arrayTwo ) {
        List<Object> arrayCompare = new ArrayList<>();
        for(Object el: arrayOne) {
            if(arrayTwo.contains(el)){
                arrayCompare.add(el);
            }
        }
        return  arrayCompare;
    }

}
