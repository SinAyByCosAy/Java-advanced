package tech.codingclub;

import java.util.Date;
import java.util.Iterator;
import java.util.Stack;

public class stack_intro {

    public static void main(String[] args) {

        System.out.println("This is TANAY SRIVASTAVA");
        System.out.println("stack_intro.java running at " + new Date().toString() + " sharp.");

        Stack <String> stack = new Stack<String>();
        Stack <Integer> stackInt = new Stack<Integer>();

        stackInt.push(2);
        stackInt.push(5);
        stackInt.push(10);
        stackInt.push(101);

        int topEle = stackInt.pop();
        System.out.println("Top Element : "+stackInt.peek());

        int index = stackInt.search(5);
        int find = stackInt.search(200);
        System.out.println("Index of 5 : "+index);
        System.out.println("Index of 200 : "+find);

        Iterator<Integer> itr = stackInt.iterator();
        System.out.println("Items through iterator");
        while (itr.hasNext()){
            int data = itr.next();
            System.out.print(data + " ");
        }
        System.out.println();

        while (! stackInt.empty()){
            int top = stackInt.pop();
            System.out.println("Popped element: "+top);
        }

    }

}
