package main.java.com.cydeo.selfPractice;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Player>{//Restriction <T> generics

    private String name;

    private List<T> members = new ArrayList<>();// using polymorphism

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println( ((Player)player).getName() + "is already on the team");
            return false;
         }else{
            members.add(player);//cast
            System.out.println( ((Player)player).getName() + "picked for the team" + this.name);
            return true;
        }
    }
}

