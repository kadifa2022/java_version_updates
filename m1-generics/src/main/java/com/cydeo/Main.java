package main.java.com.cydeo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList <Integer>items = new ArrayList();//array list is accepting any object until -generics- we put angle bracket<integer>)//
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
       // items.add("apple"); error

        printDoubled(items);// created methode


        System.out.println("*******************************************");

        FootballPlayer joe = new FootballPlayer("Joe"); // joe wants to join FT
        BaseballPlayer pat = new BaseballPlayer("Pat"); // pat wants to join BT
        SoccerPlayer beckham = new SoccerPlayer("Beckham");// beckham wants to join ST

        // creating  team and adding players  <SoccerPlayer> if we select team they will be accepting only soccer players
        Team <SoccerPlayer>liverpool = new Team("Liverpool");  //team is accepting any object -we need filter- go to team class and add<T>

       // liverpool.addPlayer(joe);
        //liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);





    }

    private static void printDoubled(ArrayList <Integer>items) {//object is from collection
        for (Integer i:items) {
            System.out.println(i *2);

            
        }

        
    }
}
