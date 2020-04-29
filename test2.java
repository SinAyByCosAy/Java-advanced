package tech.codingclub;

import java.util.Date;
public class test2 {

    public static void main(String[] args) {

        System.out.println("This is TANAY SRIVASTAVA");
        System.out.println("Test2.java running at " + new Date().toString() + " sharp.");

        int a = 400;
        int b = 20;
        int c = a+b;

        System.out.println("Sum of "+"a"+"+"+"b"+"="+c);

        double wide_variable = a;
        System.out.println("Widened Variable = "+wide_variable);

        wide_variable = a+0.1;
        System.out.println("Modified Variable = "+wide_variable);

        int narrow_variable = (int) wide_variable;
        System.out.println("Narrowed Variable = "+narrow_variable);

        int overflow_variable = Integer.MAX_VALUE;
        System.out.println("Max Value = "+overflow_variable);
        System.out.println("Min value = "+Integer.MIN_VALUE);

        overflow_variable+=4;
        System.out.println("Modified max value of the variable = "+overflow_variable);

    }
}
