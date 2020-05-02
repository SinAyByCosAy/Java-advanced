package tech.codingclub;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

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
        TaskManager taskManager = new TaskManager(100);

        for(int i=0;i<10000;i++){
            RunnableExample runnableExample = new RunnableExample("Thread -"+i, 0 , 100+i);
            taskManager.waitTillQueueIsFreeAndAddTask(runnableExample);
            System.out.println("$$$$$$$$$" + i );
        }

        System.out.println("###########" );


//        System.out.println(thread1.counter);
//        System.out.println(thread2.counter);
//        System.out.println(thread3.counter);
    }
}
