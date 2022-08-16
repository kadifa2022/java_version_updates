package main.java.com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player>{     //any class you can pass to the Team. Should accept only Player class and subclass (T-should be child class of the player)

    private String name;          //name of the team

    private List<T> members = new ArrayList<T>();        //inside bracket < >

    public String getName() {              //create getter from the name
        return name;
    }

    public Team(String name) {//create constructor from name
        this.name = name;

    }
    public boolean addPlayer(T player){//creating methode

        if (members.contains(player)){
            System.out.println(((Player)player).getName() + " is already on the team ");         // checking if the person is already on the team
            return false;
        }else{
            members.add(player);                                       //this. mean object
            System.out.println(((Player)player).getName()+ "picked for team " + this.name);        //if you on the list you don't have to registration
            return true;

        }

    }


}
