package edu.cse;

//edited by Eleanor

class Person implements Subject {
    private String myPronouns;
    private String myName;
    private String myStatus;
    private int myAngerLevel;

    Person(String gender, String name, String status, int angerLevel){
        myPronouns = gender;
        myName = name;
        myStatus = status;
        myAngerLevel = angerLevel;
    }

    public String getName(){return myName;}
    String getGender(){return myPronouns;}
    String getStatus(){return myStatus;}
    int getAngerLevel(){return myAngerLevel;}
    //gets her, his, their
//    String getPPronoun(){
//        String pronoun;
//        if (myPronouns == "female") pronoun = "her";
//        if (myPronouns == "male") pronoun = "his";
//        if (myPronouns == "other") pronoun = "their";
//        //else pronoun = "you did a typo my dude";
//        return(pronoun);
//    }
//    //gets she, he, they
//    String getNPronoun(){
//        String pronoun;
//        if (myPronouns == "female") pronoun = "she";
//        if (myPronouns == "male") pronoun = "he";
//        if (myPronouns == "other") pronoun = "they";
//        //else pronoun = "you did a typo my dude";
//        return(pronoun);
//    }
}
