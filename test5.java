package tech.codingclub;

import java.util.Date;

public class test5 {

    public static void main(String[] args) {

        System.out.println("This is TANAY SRIVASTAVA");
        System.out.println("Test5.java running at " + new Date().toString() + " sharp.");

        int a = 10;
        int b = 20;

        System.out.println("Addidtion = "+ (a+b));
        System.out.println("Subtraction = "+ (a-b));
        System.out.println("Multiplication = "+ (a*b));
        System.out.println("Division = "+ (a/b));
        System.out.println("Modulo = "+ (a%b));

        double c = -20.20;

        System.out.println("Math.abs() : "+ Math.abs(c));

        double d = Math.abs(c);
        System.out.println("Math.ceil() : "+ Math.ceil(d));
        System.out.println("Math.floor() : "+ Math.floor(d));
        System.out.println("Math.min() : "+ Math.min(2,3));
        System.out.println("Math.max() : "+ Math.max(2,3));

        System.out.println("Math.random() 0 to 10 : "+ Math.random());

        int random = 10 + (int)(Math.random()*90);
        System.out.println("Math.random() 10 to 100 : "+ random);

        System.out.println("Math.PI() : "+ Math.PI);

        int e = 100;
        System.out.println("Post Increment : "+ e++);
        System.out.println("Pre Increment : "+ ++e);

        int n = 5;
        int f = 1;
        while(n>=1){
            f *= n;
            n--;
        }
        System.out.println("5! using while loop : "+f);
    }
}
