package tech.codingclub;

import java.io.*;
import java.util.Date;

public class Debugging {

    public static void main(String[] args) throws IOException {

        int N = 10, sum = 0;
        for (int i = 1; i <= N; i++) {
            sum = sum + i;
        }

        Singleton singleton = Singleton.getSingletonInstance(456);

        System.out.println("Sum of Natural Numbers till 10 is : " + sum);
        System.out.println(new Date().toString());
        System.out.println(singleton.data + sum);

        int x = sum;
        int y = 45;
        int z = x + y;
        System.out.println(z +" must be 100 !");

        FileInputStream fstream = new FileInputStream("/home/tanaysri_/IdeaProjects/techcodingmafia/src/main/java/tech/codingclub/Debugging.java");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

//Read File Line By Line
        while ((strLine = br.readLine()) != null)   {
            // Print the content on the console - do what you want to do
            System.out.println (strLine);
        }

//Close the input stream
        fstream.close();
    }
}
