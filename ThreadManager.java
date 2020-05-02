package tech.codingclub;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadManager {

    private int poolSize;
    private ExecutorService executorService;

    public ThreadManager(int poolSize){
        this.poolSize = poolSize;
        executorService = Executors.newFixedThreadPool(poolSize);
    }

    public void execute(Runnable runnable){
        executorService.submit(runnable);
    }
    public static void main(String[] args) {

        ThreadManager threadManager = new ThreadManager(100);
//        executorService.submit(new RunnableExample("ThreadA",0,500));
//        executorService.submit(new RunnableExample("ThreadB",0,750));
//        executorService.submit(new RunnableExample("ThreadC",0,750));
        for(int i = 0; i<1000; i++){
            RunnableExample temp = new RunnableExample("Thread-No : "+i,0,500+i);
            threadManager.execute(temp);
        }
        System.out.println("#################");


    }

}