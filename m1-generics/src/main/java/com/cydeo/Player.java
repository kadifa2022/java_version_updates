package main.java.com.cydeo;

public abstract class  Player { //  abstract class (generics class example)
    private String name; //create abstract class -encapsulation -constructor

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

