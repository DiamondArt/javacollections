package javaArraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class IncreaseSize {
    public static void main(String[] args) {

        ArrayList<String> stringArray = new ArrayList<>(3);

        stringArray.add("Gute natch");
        stringArray.add("Guten morgen");
        System.out.println(stringArray);

        stringArray.ensureCapacity(10);

        System.out.println(stringArray);
    }
}