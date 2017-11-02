package edu.cse;

//edited by CJ
import static edu.cse.Main.rand;

class Gossip {
    static private String[] locations = {"in the cafe", "in the men's room", "in the women's room", "on the roof"};
    static private String[] times = {"yesterday", "last week", "last night", " "};

//    public Subject next() {
//        Subject next = Gossip[current];
//        if (current < getGossip.length - 1) {
//            current++;
//        } else {
//            current = 0;
//        }
//        return next;
//        }


    static String getGossip(String subjectType) {
        Subject subject;
        String where = locations[rand.nextInt(locations.length-1)];
        String when = times[rand.nextInt(times.length-1)];
        int fate;
        Gossip theWord;

        //generates subject and gossip based on subjectType
        switch (subjectType) {
            case "item":
                fate = rand.nextInt(1);
                subject = new Item();
                theWord = chooseGossip(subjectType, fate);
                return "[GENERIC] Somebody once told me "+subject.getName()+" "+theWord.whatHappened()+" "+where+" "+when+".";
            case "person":
                fate = rand.nextInt(4);
                subject = new Person();
                theWord = chooseGossip(subjectType, fate);
                return "[GENERIC] I heard that "+subject.getName()+" "+theWord.whatHappened()+" "+where+" "+when+".";
            default:
                if (rand.nextInt(10) < 5) {
                    fate = rand.nextInt(4);
                    subject = new Person();
                    theWord = chooseGossip(subjectType, fate);
                }
                else {
                    fate = rand.nextInt(1);
                    subject = new Item();
                    theWord = chooseGossip(subjectType, fate);
                }
                break;

        }
        return null;
    }

    //selects a gossip subclass based on subjectType
    static private Gossip chooseGossip(String subjectType, int fate) {
        String gossip;
        switch (subjectType) {
            case "item":
                if (fate == 0) return new ItemPersonInvolved();
                else return new ItemNoPerson();
            case "person":
                if (fate == 0) return new Adultery();
                else if (fate == 1) return new Crime();
                else if (fate == 2) return new TestCheat();
                else if (fate == 3) return new Transfer();
                else if (fate == 4) return new VictimCrime();
        }
        return null;
    }

    //empty method used to resolve an error
    String whatHappened(){
        return null;
    }
}
