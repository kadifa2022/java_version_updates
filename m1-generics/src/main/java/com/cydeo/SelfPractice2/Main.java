package main.java.com.cydeo.SelfPractice2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Array list only accepts objects belong to this class
        ArrayList<Integer> items = new ArrayList<Integer>();// genetic< class name objects>  come with version Java 5

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        //items.add("Apple");


        printDoubled(items);


        System.out.println("-----------------------------------------");

         FootballPlayer joe = new FootballPlayer("Joe");// Joe is register as football player
        BaseballPlayer  pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");


        Team <SoccerPlayer>liverpool = new Team("Liverpool");// Team accepting any object from any class (players)
        //liverpool.addPlayer(joe);
        //liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);


    }
    private static void printDoubled(ArrayList<Integer> items){
        for (Integer i : items) {
            System.out.println(i * 2);
        }
        System.out.println(items);
    }




}
