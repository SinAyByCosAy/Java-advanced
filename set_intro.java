package tech.codingclub;

import java.util.*;

public class set_intro {

    public static void main(String[] args) {

        System.out.println("This is TANAY SRIVASTAVA");
        System.out.println("stack_intro.java running at " + new Date().toString() + " sharp.");

        ArrayList<String> email = new ArrayList<String>();

        email.add("abc@hotmail.com");
        email.add("abc@hotmail.com");
        email.add("abc@hotmail.com");
        email.add("xyzzz@gmail.com");
        email.add("kbcskd@contact.com");
        email.add("hr@tiktok.com");
        email.add("hr@tiktok.com");
        email.add("hr@tiktok.com");
        email.add("admin@tiktok.com");

        ArrayList<String> blacklisted = new ArrayList<String>();
        blacklisted.add("hr@tiktok.com");
        blacklisted.add("admin@tiktok.com");
        Set<String> uniqueEmails = new HashSet<String>();
        uniqueEmails.add("hr@gmail.com");
        uniqueEmails.addAll(email);

        Iterator itr = uniqueEmails.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Size of set : "+uniqueEmails.size());
        uniqueEmails.remove("abc@hotmail.com");

        System.out.println("AFTER REMOVING abc@hotmail.com FROM THE SET");
        for(String x : uniqueEmails){
            System.out.println(x);
        }

        uniqueEmails.removeAll(blacklisted);
        System.out.println("AFTER REMOVING BLACKLISTED EMAILS FROM THE SET");
        for(String x : uniqueEmails){
            System.out.println("Sending emails to : "+x);
        }
        boolean x = uniqueEmails.contains("hr@gmail.com");
        System.out.println("hr@gmail present in the mailing list : "+x);

    }
}
