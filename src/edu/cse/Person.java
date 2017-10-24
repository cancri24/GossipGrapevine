package edu.cse;

//edited by Eleanor

class Person implements Subject {
    private String myPronouns;
    private String myName;
    private String myStatus;
    private int myAngerLevel;

    Person(String gender, String name, String status, int angerLevel) {
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
    String getPosPronoun(){
        String pronoun;
        if (myPronouns == "female") pronoun = "her";
        else
        if (myPronouns == "male") pronoun = "his";
        else
        if (myPronouns == "other") pronoun = "their";
        else pronoun = "you did a typo my dude";
        return(pronoun);
    }
    //gets she, he, they
    String getSubPronoun(){
        String pronoun;
        if (myPronouns == "female") pronoun = "she";
        else
        if (myPronouns == "male") pronoun = "he";
        else
        if (myPronouns == "other") pronoun = "they";
        else pronoun = "you did a typo my dude";
        return(pronoun);
    }
    //gets her, him, them
    String getPerPronoun(){
        String pronoun;
        if (myPronouns == "female") pronoun = "her";
        else
        if (myPronouns == "male") pronoun = "him";
        else
        if (myPronouns == "other") pronoun = "them";
        else pronoun = "you did a typo my dude";
        return(pronoun);
    }
}
