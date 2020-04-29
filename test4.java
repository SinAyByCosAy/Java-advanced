package tech.codingclub;

import java.util.Date;
import java.util.Scanner;

public class test4 {

    public static void main(String[] args) {

        System.out.println("This is TANAY SRIVASTAVA");
        System.out.println("Test4.java running at " + new Date().toString() + " sharp.");

        int arr[] = {10,20,30,40};
        arr[3] = 80;

        System.out.println("Last value is : "+arr[arr.length -1]);

        int mat[][] = {{1,2,3,4} , {5,6,7,8}};
        System.out.println("Last col last row : "+mat[1][3]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        System.out.println("Sum of a and b = "+(a+b));
    }
}