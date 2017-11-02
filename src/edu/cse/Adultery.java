package edu.cse;
//edited by Eleanor

import java.util.Objects;

import static edu.cse.Main.rand;

class Adultery extends Gossip {
    private Person wife;
    private Person handmaid;
    private String[] femRoles = {"girlfriend","wife"};
    private String[] mascRoles = {"boyfriend","husband"};
    private String[] andRoles = {"partner","spouse"};
    private String wifeRole;
    Adultery(){
        wife = new Person();
        handmaid = new Person();
        if(Objects.equals(wife.getGender(),"female"))wifeRole=femRoles[rand.nextInt(1)];
        else if(Objects.equals(wife.getGender(),"male"))wifeRole=mascRoles[rand.nextInt(1)];
        else wifeRole=andRoles[rand.nextInt(1)];
    }
    public String whatHappened(){return "cheated on their "+wifeRole+" "+wife.getName()+" with "+handmaid.getName();}
}
