package com.cydeo;

public class AppleHeavyPredicate implements ApplePredicate{


    @Override          //class and object
    public boolean test(Apple apple) {
        return apple.getWeight()>200;//getWeight() is coming from Apple class-getter we putted
    }
}
