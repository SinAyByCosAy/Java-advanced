package tech.codingclub;

import java.util.ArrayList;
import java.util.Date;

public class DS {

    public static void main(String[] args) {

        System.out.println("This is TANAY SRIVASTAVA");
        System.out.println("Test7.java running at " + new Date().toString() + " sharp.");

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Welcome");
        arrayList.add("to");
        arrayList.add("the");
        arrayList.add("Java");
        arrayList.add("Code");
        arrayList.add("RemoveMe");

        String first = arrayList.get(0);
        System.out.println("First word : "+first);

        arrayList.set(4,"course");

        int size = arrayList.size();
        System.out.println("Original Array List");
        for(int i=0;i<arrayList.size();i++)
            System.out.println(arrayList.get(i));

        arrayList.remove(size-1);

        System.out.println("Array List after removing element");
        for(int i=0;i<arrayList.size();i++)
            System.out.println(arrayList.get(i));

        arrayList.clear();
        System.out.println("Size after clearing Array List : "+arrayList.size());

    }
}
