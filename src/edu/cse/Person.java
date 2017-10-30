package edu.cse;

//edited by Eleanor & CJ

import java.util.Objects;

import static edu.cse.Main.rand;

class Person implements Subject {

    static private String[] nameStart = {"Chris", "El", "Al", "Sam","Am","Bri","An","Beth","Gwen","Del","Lo","Mac","Mad","Mel","Soph","Vic","Viv","Ben"};
    static private String[] nameMiddle = {"", "ea", "ta", "an","iza","da","li","do","ken","is","tor","u"};
    static private String[] nameEnd = {"", "tha","nor","pher","ion","ley","a","beth","da","lah","lyn","zie","sa","ia","el","ian","son","ary"};
    static private String[] lastNameStart = {"Sham", "Ter", "Den", "Ir", "Chu","Chan", "Tran", "Li", "Lu", "Her"};
    static private String[] lastNameMiddle = {"nan", ""};
    static private String[] lastNameEnd = {"ble", "on", "is", ""};
    static private String[] pronouns = {"female", "male", "other"};
    private String myPronouns;
    private String firstName;
    private String lastName;

    Person() {
        firstName = nameStart[rand.nextInt(nameStart.length-1)] + nameMiddle[rand.nextInt(nameMiddle.length-1)] + nameEnd[rand.nextInt(nameEnd.length-1)];
        lastName = nameStart[rand.nextInt(lastNameStart.length-1)] + lastNameMiddle[rand.nextInt(lastNameMiddle.length-1)] + lastNameEnd[rand.nextInt(lastNameEnd.length-1)];
        myPronouns = pronouns[rand.nextInt(pronouns.length-1)];
    }
    static Person createPerson() {
        Person themans = new Person();
        return themans;
    }

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getName(){return firstName + " " + lastName;}
    String getGender(){return myPronouns;}

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
