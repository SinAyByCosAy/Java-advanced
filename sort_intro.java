package tech.codingclub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class sort_intro {
    public static void main(String[] args) {

        System.out.println("This is TANAY SRIVASTAVA");
        System.out.println("Sort_intro.java running at " + new Date().toString() + " sharp.");
        ArrayList<String> email = new ArrayList<String>();

        email.add("admin@linkedin.com");
        email.add("hr@google.com");
        email.add("admin@google.com");
        email.add("contact@gmail.com");

        System.out.println("Original list");
        for(String x: email){
            System.out.println(x);
        }

        System.out.println("#########After sorting########");
        Collections.sort(email);
        for(String x: email){
            System.out.println(x);
        }

        int arr[] = {43,22,1,45,654,3};
        Arrays.sort(arr);

        System.out.println("Sorted Array");
        for(int ele: arr){
            System.out.println(ele);
        }
    }
}
