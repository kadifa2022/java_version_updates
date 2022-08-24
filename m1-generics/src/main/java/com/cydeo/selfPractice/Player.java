package main.java.com.cydeo.selfPractice;

public abstract class Player {   //abstract class we can't create objects

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
