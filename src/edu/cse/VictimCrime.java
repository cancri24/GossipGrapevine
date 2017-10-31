package edu.cse;

import static edu.cse.Main.rand;

class VictimCrime extends Crime {
    Person victim = new Person();
    static private String [] crime = {"ate","murdered","is in a relationship with","stabbed","burned","was seen cuddling","was seen kissing"};
    private String cr;
    VictimCrime(){
        cr = crime[rand.nextInt(crime.length-1)];
    }
    public String whatHappened(){
        return cr+victim.getName()+".";
    }
}
