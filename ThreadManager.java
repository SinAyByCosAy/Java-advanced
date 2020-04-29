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

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(new RunnableExample("ThreadA",0,500));
        executorService.submit(new RunnableExample("ThreadB",0,750));
        executorService.submit(new RunnableExample("ThreadC",0,750));


    }

}