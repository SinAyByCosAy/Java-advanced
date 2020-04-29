package tech.codingclub;

import java.util.Date;

public class SingletonAndException {

    public static void main(String[] args) {

        System.out.println("This is TANAY SRIVASTAVA");
        System.out.println("SingletonAndException running at " + new Date().toString() + " sharp.");

        Singleton_ex.main(args);
        ExceptionExample.main(args);
    }
}

