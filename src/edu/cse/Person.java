package edu.cse;

//edited by Eleanor
import static edu.cse.Main.rand;

class Person implements Subject {

    static private String[] nameStart = {"Chris", "El", "Al", "Sam","Am","Bri","An","Beth","Gwen","Del","Lo","Mac","Mad","Mel","Soph","Vic","Viv","Ben", "Bee", "Bor"};
    static private String[] nameMiddle = {"", "ea", "ta", "an","iza","da","li","do","ken","is","tor","u", "bee", "al"};
    static private String[] nameEnd = {"", "tha","nor","pher","ion","ley","a","beth","da","lah","lyn","zie","sa","ia","el","ian","son","ary", "bert", "bee", "tee"};
    static private String[] lastNameStart = {"Sham", "Ter", "Den", "Ir", "Chu","Chan", "Tran", "Li", "Lu", "Her", "Pu", "Hil", "Bee", "Su", "Sur", "Cu"};
    static private String[] lastNameMiddle = {"", "nan", "now", "ba", "bee","char"};
    static private String[] lastNameEnd = {"ck", "ble", "on", "is", "", "tin", "ga", "bee", "ski", "en", "ry", "ru", "ge"};
    static private String[] pronouns = {"female", "male", "other"};
    private String myPronouns;
    private String firstName;
    private String lastName;

    Person() {
        firstName = nameStart[rand.nextInt(nameStart.length-1)] + nameMiddle[rand.nextInt(nameMiddle.length-1)] + nameEnd[rand.nextInt(nameEnd.length-1)];
        lastName = nameStart[rand.nextInt(lastNameStart.length-1)] + lastNameMiddle[rand.nextInt(lastNameMiddle.length-1)] + lastNameEnd[rand.nextInt(lastNameEnd.length-1)];
        myPronouns = pronouns[rand.nextInt(pronouns.length-1)];

        if(firstName.equals("Beebeebee") && lastName.equals("Beebeebee")) {
            firstName = "Madame";
            lastName = "Swarm";
            myPronouns = pronouns[0];
        }
    }

//    public String getFirstName(){return firstName;}
//    public String getLastName(){return lastName;}
    public String getName(){return firstName + " " + lastName;}
    String getGender(){return myPronouns;}

}
