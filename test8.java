package tech.codingclub;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class test8 {

    public static void main(String[] args) {

        System.out.println("This is TANAY SRIVASTAVA");
        System.out.println("Test8.java running at " + new Date().toString() + " sharp.");

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("This");
        linkedList.add("is");
        linkedList.add("how");
        linkedList.add("you");
        linkedList.add("code");
        linkedList.add("linked list");

        String first = linkedList.getFirst();
        String last = linkedList.getLast();

        System.out.println(first+" : "+last);
        int size = linkedList.size();
        System.out.println("Size of Linked List : "+size);

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            String data = iterator.next();
            System.out.println(data);
        }
    }
}
