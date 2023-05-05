package main.java.com.cydeo.SelfPractice2;

public abstract class Player {//from abstract, we can't create object


    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
