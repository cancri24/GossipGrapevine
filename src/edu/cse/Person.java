package edu.cse;

//edited by CJ
import static edu.cse.Main.rand;

class Person implements Subject {
    private String name;
    private static String[] namelist = {"Josh"};

    Person() {
        name = namelist[rand.nextInt(namelist.length)];
    }

    public String getName() {
        return name;
    }
}
