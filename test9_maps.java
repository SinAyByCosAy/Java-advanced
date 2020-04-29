package tech.codingclub;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class test9_maps {

    public static void main(String[] args) {

        System.out.println("This is TANAY SRIVASTAVA");
        System.out.println("Test9.java running at " + new Date().toString() + " sharp.");

        Map<String,String>  countryToCapital = new HashMap<String, String>();
        countryToCapital.put("India","New Delhi");
        countryToCapital.put("China","Beijing");
        countryToCapital.put("Canada","Ottawa");

        if(countryToCapital.containsKey("India")){
            System.out.println("Capital of India is : "+countryToCapital.get("India"));
        }
        if(countryToCapital.containsKey("Russia")){
            System.out.println("Capital of Russia is : "+countryToCapital.get("Russia"));
        }
        else{
            System.out.println("Capital of Russia is not there in the database");
        }

        System.out.println("Keys below: ");
        for(String keys : countryToCapital.keySet()){
            System.out.println(keys);
        }
        System.out.println("Values below: ");
        for(String values : countryToCapital.values()){
            System.out.println(values);
        }
        System.out.println("##################");
        for(String keys : countryToCapital.keySet()){
            System.out.println(keys+" : "+countryToCapital.get(keys));
        }
        countryToCapital.remove("Canada");
        System.out.println("#####After removing Canada#######");
        for(String keys : countryToCapital.keySet()){
            System.out.println(keys+" : "+countryToCapital.get(keys));
        }
    }
}
