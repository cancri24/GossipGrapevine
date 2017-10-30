package edu.cse;

import static edu.cse.Main.rand;
//edited by Samuel, Eleanor, & CJ

class Item implements Subject {
    //edited by Eleanor
    static private String Type[] = {"table","chair","vending machine","desk","ruler","apple","laptop","phone"};
    static private String Adjective [] = {"bONELESS","peasy","yeezy","tainted","infected","crusty","ashy"};
    private String type;
    private String adj;
//    Item(String owner_name, String type){
//        Owner = owner_name;
//        Type = type;
//    }
    Item (){
        type = Type[rand.nextInt(Type.length-1)];
        adj = Adjective[rand.nextInt(Adjective.length-1)];
    }
    public String getName(){
        return "";
    }
    //edited by Sam & CJ
//    public String getName() {
//        if(Owner == null) return "a " + Type;
//        else return Owner + "'s " + Type;
//    }

    /* Old method, may use in future
    public String ownerPosession() {
    if (Owner == null) {
        return "[GENERIC] No owner";
    } else {
        return "This is " + Owner + "'s " + Type; }
    }*/
}
