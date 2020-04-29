package tech.codingclub;

public class Singleton_ex {

    public static void main(String[] args) {

//        Singleton obj1 = new Singleton();
//        Singleton obj2 = new Singleton();

        Singleton obj1 = Singleton.getSingletonInstance(90);
        Singleton obj2 = Singleton.getSingletonInstance(56);


        obj1.data = 90;
        obj2.data = 56;

        System.out.println(obj1.data+" & "+obj2.data);
    }
}
