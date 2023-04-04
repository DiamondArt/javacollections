package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class ArrayLinkedList {
    public static void main(String[] args) {

        System.out.println(createLinkedList());
    }

    public static List createLinkedList() {
        LinkedList<String>  l_list = new LinkedList<>();
        // use add to append element to linkedlist
        l_list.add("Red");
        l_list.add("Blue");
        l_list.add("Pink");
        return l_list;
    }
}
