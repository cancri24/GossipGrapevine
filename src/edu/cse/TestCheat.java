package edu.cse;

import static edu.cse.Main.rand;

class TestCheat extends Crime {
    static private String [] subject = {"biochem","algebra","advanced chem","english","physics","calculus","driving"};
    private String mySubject;
    TestCheat(){
        mySubject = subject[rand.nextInt(subject.length-1)];
    }
    public String whatHappened(){
        return "cheated on a "+subject+"test";
    }
}