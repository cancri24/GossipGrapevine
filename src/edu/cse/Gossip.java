package edu.cse;

//edited by CJ
import static edu.cse.Main.rand;

class Gossip {
    static private String[] locations = {"in the cafe", "in the men's room", "in the women's room", "on the roof"};
    static private String[] times = {"yesterday", "last week", "last night", ""};

    //gossip generator that takes type of gossip (item vs person) as the input
    static String getGossip(String subjectType) {
        Subject subject;
        String where = locations[rand.nextInt(locations.length-1)];
        String when = times[rand.nextInt(times.length-1)];
        int fate = rand.nextInt(5);
        Gossip theWord;
        String what = null;

        //generates subject and gossip based on subjectType
        switch (subjectType) {
            case "item":
                subject = new Item();
                break;
            case "person":
                subject = new Person();
                theWord = chooseGossip(subjectType, fate);
                break;
            default:
                if (rand.nextInt(10) < 5) {
                    subject = new Person();
                    theWord = chooseGossip(subjectType, fate);
                }
                else {
                    subject = new Item();
                }

        }
        //generic gossip generation statement
        return "[GENERIC] I heard that " + subject + " was caught " + what + " " + where +".";
    }

    //selects a gossip subclass based on subjectType
    static private Gossip chooseGossip(String subjectType, int fate) {
        switch (subjectType) {
            case "item":
                return null;
            case "person":
                if (fate == 0) return new Adultery();
                else if (fate == 1) return new Crime();
                else if (fate == 2) return new Relationship();
                else if (fate == 3) return new TestCheat();
                else if (fate == 4) return new Transfer();
                else if (fate == 5) return new VictimCrime();
        }
        return null;
    }
}
