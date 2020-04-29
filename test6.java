package tech.codingclub;

import java.util.Date;
import java.util.Random;

public class test6 {

    public static void main(String[] args) {

        System.out.println("This is TANAY SRIVASTAVA");
        System.out.println("Test6.java running at " + new Date().toString() + " sharp.");

        Random random = new Random();
        int rand_val = random.nextInt(100);
        System.out.println("randomIntValue : 0-99 " + rand_val);

        rand_val = 50 + random.nextInt(50);
        System.out.println("randomIntValue : 0-99 " + rand_val);

        String str = "HelloWorld";
        System.out.println("Printing String : "+str);
        str = str + "!";
        System.out.println("Printing modified String : "+str);

        System.out.println("Current Length : "+str.length());
        System.out.println("string(5,n) : "+str.substring(5));
        System.out.println("string(5th and 6th index) : "+str.substring(5,7));

        System.out.println("Uppercase : "+str.toUpperCase());
        System.out.println("Lowercase : "+str.toLowerCase());

        int w = str.indexOf('W');
        System.out.println("Index of W : "+w);

        char g = str.charAt(6);
        System.out.println("Char at 6th index : "+ g);

        String s1 = "abc";
        String s2 = "abd";
        System.out.println(s1.compareTo(s2));

        Date date = new Date();
        long prevTime = date.getTime();

        for(int i=0;i<1000000;i++){

        }
        long timeNow = new Date().getTime();
        long diff = timeNow - prevTime;
        System.out.println(diff+ " milliseconds to run 10^6 on my machine.");
        System.out.println(new Date().toString());

        Date datefromEpoch = new Date(1585824696583L);
        System.out.println(datefromEpoch.toString());


    }
}