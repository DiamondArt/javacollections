package linkedlist.test;

import linkedlist.IterateLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class IterateLinkedListTest {

    @org.junit.Test
    public void IterateLinkedListTestOne(){
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red","Orange","Pink","Yellow"));
        IterateLinkedList.printArrayList(list);
    }
}
