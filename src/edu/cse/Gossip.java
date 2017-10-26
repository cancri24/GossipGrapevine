package edu.cse;

//edited by CJ
import static edu.cse.Main.rand;

class Gossip {
    static private String where;
    static private String when;
    static private String what;
    static private Subject subject;

    static String getGossip(String type) {
        switch (type) {
            case "item":
                subject = new Item(null, null /*FIX ME LATER*/);
                break;
            case "person":
                subject = new Person();
                break;
            default:
                if (rand.nextInt(10) < 5) subject = new Person();
                else subject = new Item(null, null /*FIX ME LATER*/);

        }
        return "ERROR. CODE INCOMPLETE.";
    }
}
