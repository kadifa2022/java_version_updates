package main.java.com.cydeo.SelfPractice2;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Player>{//adding generics-> restriction <T>type / can be any team

    private String name;

    private List<T> members = new ArrayList<T>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public boolean addPlayer(T player){
        if (members.contains(player)){ // cast down to Player
            System.out.println(((Player)player).getName() + " id already on the team");
            return false;
        }else{//if you not on the list adding new player's name
            members.add(player);
            System.out.println(((Player)player).getName()+ " picked for team " + this.name);// this.(mean)current object
            return true;
        }
    }



}
