package com.cydeo.TaskSelfPractice.appleTask;

public class AppleGreenColorPredicate implements ApplePredicate{


    @Override
    public boolean testApple(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
