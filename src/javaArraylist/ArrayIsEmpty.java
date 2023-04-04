package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*********************************************************************************
 *
 * @Author: Melissa Kouadio
 * @Link: <https://github.com/DiamondArt
 * @Description: Write a Java program to test an array list is empty or not
 *
 * ******************************************************************************/
public class ArrayIsEmpty {
    public static void main(String[] args) {
        ArrayList<Integer> arrayNumberOne = new ArrayList<>(Arrays.asList(12,65,55,22,89));
        ArrayList<Integer> arrayNumberTwo = new ArrayList<>();

        System.out.println(emptyArray(arrayNumberOne));
        System.out.println(emptyArray(arrayNumberTwo));
    }

    public static boolean emptyArray(ArrayList arr) {
        return arr.isEmpty();
    }
}
