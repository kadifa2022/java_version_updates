package main.java.com.cydeo.selfPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {//until Java 5 wasn't protection--after java  < angle brackets>generics to protect class and interface

        ArrayList <Integer>items=new ArrayList<Integer>(); //<angle brackets>-generics
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
       // items.add("Apple");  //different data type -integer //

        printDoubled(items);


        System.out.println("************************************************");

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat= new BaseballPlayer("Pat");
        SoccerPlayer beckham= new SoccerPlayer("Beckham");

        Team <SoccerPlayer> liverpool =new Team("Liverpool"); //team is accepting any objects without <T> Type
      //  liverpool.addPlayer(Joe);//object belongs to another Team
       // liverpool.addPlayer(Pat);
        liverpool.addPlayer(beckham);

        Team<SoccerPlayer> brokenTeam = new Team<>(  "what kind of team is this one");
        ///
    }

    private static void printDoubled(ArrayList<Integer>items){
        for (Integer i: items) {
            System.out.println(i*2);
            
        }
    }
}
