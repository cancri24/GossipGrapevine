//edited by Eleanor
package edu.cse;

import static edu.cse.Main.rand;

public class ItemNoPerson extends Gossip {
    static private String[] whats = {"was melted in a biochem lab","was broken","was repaired"};
    private String what;
    ItemNoPerson(){
        what = whats[rand.nextInt(whats.length-1)];
    }
    public String whatHappened(){
        return what;
    }
}
