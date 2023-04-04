package javaArraylist;

import java.util.*;

/**
 * Write a Java program of swap two elements in an array list
 * */
public class SwappArrayElement {
    public static void main(String[] args) {

        ArrayList<String> stringArrayOne = new ArrayList<>(Arrays.asList("Helo","Hi","Blabla","Love","Nice"));
        ArrayList<Integer> arrayNumberOne = new ArrayList<>(Arrays.asList(12,65,55,22,89));

        System.out.println("============== Array before swap =================");
        System.out.println(arrayNumberOne);

        System.out.println("============== Array after swap =================");
        List newArray = swapArrayElement(arrayNumberOne,2,4);
        System.out.println(newArray);
        System.out.println("============== Method Two  =================");
        swapArrayElement2(arrayNumberOne, 2,4);
    }

    public static List swapArrayElement(List array, int indexOne, int indexTwo) {

        List other = new ArrayList<>();
        Object valueOne = array.get(indexOne);
        Object valueTwo = array.get(indexTwo);

        array.set(indexOne, valueTwo);
        array.set(indexTwo, valueOne);
        return  array;
    }
    public static void swapArrayElement2 (List array, int indexOne,int indexTwo) {
        Collections.swap(array,  indexOne, indexTwo);
        System.out.println("Array list after swap:");
        for(Object b: array) {
            System.out.println(b);
        }
    }
}
