package linkedlist;

import java.util.LinkedList;

public class IterateLinkedList {

    public static void printArrayList(LinkedList linkedList){
        linkedList.forEach(item -> {
            System.out.println(item);
        });
    }
}
