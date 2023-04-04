package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;

/***
 * Write a Java program to replace the second element of a ArrayList with the specified element.
 * */
public class ReplaceSecondElementInArray {
    public static void main(String[] args) {

        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("Hello","Hi","Blabla","Love","Nice"));
        ArrayList<Integer> arrayNumberOne = new ArrayList<>(Arrays.asList(12,65,55,22,89));
        ArrayList<Boolean> arrayBool = new ArrayList<>(Arrays.asList(true,false,false,false,false));

        System.out.println("=================== ARRAY BEFORE REPLACEMENT===================" );
        System.out.println(stringArray);
        System.out.println(arrayNumberOne);
        System.out.println(arrayBool);

        System.out.println("======================= ARRAY AFTER REPLACEMENT ======================" );
        System.out.println(replaceSecondElement(stringArray, "Gagagag"));
        System.out.println(replaceSecondElement(arrayNumberOne, 100));
        System.out.println(replaceSecondElement(arrayBool, true));

    }
    public static ArrayList replaceSecondElement(ArrayList arr, Object newElement){
        arr.set(2, newElement);
        return  arr;
    }
}
