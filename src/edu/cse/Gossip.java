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
                fate = rand.nextInt(2);
                subject = new Item();
                theWord = chooseGossip(subjectType, fate);
                return "[GENERIC] Somebody once told me "+subject.getName()+" "+theWord.whatHappened()+" "+where+" "+when+".";
            case "person":
                fate = rand.nextInt(5);
                subject = new Person();
                theWord = chooseGossip(subjectType, fate);
                return Gossip.spread(subject.getName(), theWord.whatHappened(), where, when);

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

    static private String spread(String who, String what, String where, String when) {
        int phraseChoose = rand.nextInt(13);
        if(phraseChoose == 0) return "Somebody once told me "+who+" "+what+" "+where+" "+when+".";
        else if(phraseChoose == 1) return "Did you hear? They say "+who+" "+what+" "+where+" "+when+".";
        else if(phraseChoose == 2) return "Rumor has it "+who+" "+what+" "+where+" "+when+".";
        else if(phraseChoose == 3) return "A little birdy told me "+who+" "+what+" "+where+" "+when+".";
        else if(phraseChoose == 4) return "Word around the school is that "+who+" "+what+" "+where+" "+when+".";
        else if(phraseChoose == 5) return "Can you believe it? They're saying "+who+" "+what+" "+where+" "+when+".";
        else if(phraseChoose == 6) return "I know it sounds crazy, but "+who+" "+what+" "+where+" "+when+".";
        else if(phraseChoose == 7) return "Apparently "+who+" "+what+" "+where+" "+when+".";
        else if(phraseChoose == 8) return "My sources tell me "+who+" "+what+" "+where+" "+when+".";
        else if(phraseChoose == 9) return "Don't tell anyone I told you this, but "+who+" "+what+" "+where+" "+when+".";
        else if(phraseChoose == 10) return "Could it be true? I heard "+who+" "+what+" "+where+" "+when+".";
        else if(phraseChoose == 11) return "Oh my god! I was just informed that "+who+" "+what+" "+where+" "+when+".";
        else if(phraseChoose == 12) return "This might not be true, but I've been told "+who+" "+what+" "+where+" "+when+".";
        else return "I heard that "+who+" "+what+" "+where+" "+when+".";
    }

    //empty method used to resolve an error
    String whatHappened(){
        return null;
    }
}
