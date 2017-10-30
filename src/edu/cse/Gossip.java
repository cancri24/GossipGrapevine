package edu.cse;

//edited by CJ
import static edu.cse.Main.rand;

class Gossip {
    static String[] locations = {};
    static String[] times = {"yesterday", "last week", "last night", ""};

    static String getGossip(String subjectType) {
        Subject subject;
        String where;
        String when;
        String what;

        switch (subjectType) {
            case "item":
                subject = new Item();
                break;
            case "person":
                subject = new Person();
                break;
            default:
                if (rand.nextInt(10) < 5) subject = new Person();
                else subject = new Item();

        }
        return "ERROR. CODE INCOMPLETE.";
    }
}
