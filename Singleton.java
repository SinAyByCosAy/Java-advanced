package tech.codingclub;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Singleton {

    public int data;

    private static Singleton singleton;

    private Singleton(int data){
        this.data = data;
        System.out.println("Constructor was called when data was : "+data);
    }

//    public static void main(String[] args) {
//
//    }

    public static Singleton getSingletonInstance(int data) {
        if(singleton==null){
            singleton = new Singleton(data);
        }
        return singleton;

    }
}
