package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Write a Java program to shuffle elements in a array list
 * */
public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("Bonjour","I love you","I'm happy","Hello","Hi"));
        ArrayList<Integer> numberArray = new ArrayList<>(Arrays.asList(23,45,89,90,3,1,56));

        System.out.println("=============== Shuffle String array =======================");
        shuffeArrayArray(stringArray);
        System.out.println("================ Shuffle Integer array ===============");
        shuffeArrayArray(numberArray);
    }

    public static void shuffeArrayArray(ArrayList array){
        Collections.shuffle(array);
        System.out.println(array);
    }
}
