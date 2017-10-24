package edu.cse;

//edited by Samuel

class Item implements Subject {
    public String Owner;
    public String Type;

   // Item(String Owner) {Owner = name;}

    public String getName() { return Owner; }

    public String ownerPosession() {
    if (Owner == null) {
        return "[GENERIC] No owner";
    } else {
        return "This is " + Owner + "'s " + Type; }
    }
}
