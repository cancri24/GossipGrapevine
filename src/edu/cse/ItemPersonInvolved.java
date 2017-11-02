//edited by Eleanor
package edu.cse;

import static edu.cse.Main.rand;

class ItemPersonInvolved extends Gossip {
    private Person thedude;
    static private String[] whats = {"tripped over","vandalized","eaten","body slammed","smashed"};
    private String what;
    ItemPersonInvolved(){
        thedude = new Person();
        what = whats[rand.nextInt(whats.length-1)];
    }
    public String whatHappened(){
        return "was "+what+" by "+thedude.getName();
    }
}
