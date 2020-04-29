package tech.codingclub;

import java.util.Scanner;

public class ThreadExample extends Thread {

    private String threadName;
    private int counter;
    private int waitTime;

    public ThreadExample(String threadName, int counter, int waitTime){

        this.threadName = threadName;
        this.counter = counter;
        this.waitTime = waitTime;
    }

    public void run(){
        while(counter<1000) {
            counter++;

                try {
                    Thread.sleep(waitTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            System.out.println(threadName+" : "+counter);
        }
    }

    public static void main(String[] args) {

        ThreadExample thread1 = new ThreadExample("Thread_A", 0, 500);
        ThreadExample thread2 = new ThreadExample("Thread_B",0, 1000);
        ThreadExample thread3 = new ThreadExample("Thread_C",0, 2000);

        thread1.start();
        thread2.start();
        thread3.start();

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

//        System.out.println(thread1.counter);
//        System.out.println(thread2.counter);
//        System.out.println(thread3.counter);
    }
}
