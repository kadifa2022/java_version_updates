package main.java.com.cydeo.SelfPractice2;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;

    private List<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public boolean addPlayer(Player player){
        if (members.contains(player)){
            System.out.println(player.getName() + " id already on the team");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName()+ " picked for team " + this.name);
            return true;
        }
    }



}
