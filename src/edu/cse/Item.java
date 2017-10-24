package edu.cse;

//edited by Samuel & CJ

class Item implements Subject {
    public String Owner;
    public String Type;

   //Item(String Owner) {Owner = name;}

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
