package edu.cse;

//edited by Eleanor

import java.util.Objects;

class Person implements Subject {

    private String[] nameStart = {"Chris", "El", "Al", "Sam"};
    private String[] nameMiddle = {"", "ea", "ta", "an"};
    private String[] nameEnd = {"", "tha","nor","pher","ion","ley","a"};
    private String[] lastNameStart = {"Sham"};
    private String[] lastNameMiddle = {""};
    private String[] lastNameEnd = {"ble"};
    private String myPronouns;
    private String myName;
    private String myStatus;

    Person() {

    }

    public String getName(){return myName;}
    String getGender(){return myPronouns;}
    String getStatus(){return myStatus;}

    //gets her, his, their
    String getPosPronoun(){
        String pronoun;
        if (Objects.equals(myPronouns, "female")) pronoun = "her";
        else if (Objects.equals(myPronouns, "male")) pronoun = "his";
        else if (Objects.equals(myPronouns, "other")) pronoun = "their";
        else pronoun = "you did a typo my dude";
        return(pronoun);
    }

    //gets she, he, they
    String getSubPronoun(){
        String pronoun;
        if (Objects.equals(myPronouns, "female")) pronoun = "she";
        else if (Objects.equals(myPronouns, "male")) pronoun = "he";
        else if (Objects.equals(myPronouns, "other")) pronoun = "they";
        else pronoun = "you did a typo my dude";
        return(pronoun);
    }

    //gets her, him, them
    String getPerPronoun(){
        String pronoun;
        if (Objects.equals(myPronouns, "female")) pronoun = "her";
        else if (Objects.equals(myPronouns, "male")) pronoun = "him";
        else if (Objects.equals(myPronouns, "other")) pronoun = "them";
        else pronoun = "you did a typo my dude";
        return(pronoun);
    }
}
