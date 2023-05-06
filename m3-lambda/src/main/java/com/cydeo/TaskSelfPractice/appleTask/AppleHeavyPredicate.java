package com.cydeo.TaskSelfPractice.appleTask;

public class AppleHeavyPredicate  implements ApplePredicate{
    @Override
    public boolean testApple(Apple apple) {
        return apple.getWeight()>200;
    }
}
