package edu.cse;
//Edited By Samuel
class Item implements Subject {
    public String Owner;
    public String Type;

   // Item(String Owner) {Owner = name;}

    String getName() { return Owner; }

    public String ownerPosession() {
    if (Owner == null) {
        return "[GENERIC] No owner";
    } else {
        return "This is " + Owner + "'s " + Type; }
    }
}
