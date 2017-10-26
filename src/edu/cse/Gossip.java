package edu.cse;

//edited by CJ
import static edu.cse.Main.rand;

class Gossip {
    private String where;
    private String when;
    private Subject subject;
    private String type;

    Gossip() {
        if(rand.nextInt(10) < 5) {
            subject = new Person();
            type = "person";
        }
        else {
            subject = new Item(null, null /*FIX ME LATER*/);
            type = "item";
        }


    }

    String spreadGossip() {
         return "NOT DONE HOLD ON PL0X";
    }
}
