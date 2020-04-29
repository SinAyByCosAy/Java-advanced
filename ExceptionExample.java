package tech.codingclub;

import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {

        int x= 100;
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        try{

            int ans = x/y;
            System.out.println("Ans is : "+ans);

        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            int arr[] = {2,5,8};
            System.out.println(arr[100]);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException !!");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException !!");
        }
        catch (Exception e){
            System.out.println("Caught "+e.getClass());
        }
        finally {
            System.out.println("Inside Finally");
        }
        System.out.println("HELLLO");

    }
}
