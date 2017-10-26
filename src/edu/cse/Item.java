package edu.cse;

//edited by Samuel, Eleanor, & CJ

class Item implements Subject {
    private String Owner;
    private String Type;
    //edited by Eleanor
    Item(String owner_name, String type){
        Owner = owner_name;
        Type = type;
    }
    //edited by Sam & CJ
    public String getName() {
        if(Owner == null) return "a " + Type;
        else return Owner + "'s " + Type;
    }

    /* Old method, may use in future
    public String ownerPosession() {
    if (Owner == null) {
        return "[GENERIC] No owner";
    } else {
        return "This is " + Owner + "'s " + Type; }
    }*/
}
