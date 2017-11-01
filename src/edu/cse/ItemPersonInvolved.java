package edu.cse;

import static edu.cse.Main.rand;

class ItemPersonInvolved extends Gossip {
    private Person thedude;
    static private String[] whats = {"tripped over","vandalized","ate","body slammed","smashed"};
    private String what;
    ItemPersonInvolved(){
        thedude = new Person();
        what = whats[rand.nextInt(whats.length-1)];
    }
    public String whatHappened(){
        return thedude.getName()+" "+whats;
    }
}
