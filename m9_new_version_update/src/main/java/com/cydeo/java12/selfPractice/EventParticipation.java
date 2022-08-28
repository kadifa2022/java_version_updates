package com.cydeo.java12.selfPractice;

import  java.util.List;

public class EventParticipation {

    private List<String> guestNameList;
    private Integer totalNumberOfParticipants;

    @Override
    public String toString() {
        return "EventParticipation{" +
                "guestNameList=" + guestNameList +
                ", totalNumberOfParticipants=" + totalNumberOfParticipants +
                '}';
    }

    public EventParticipation(List<String> guestNameList,
                              Integer totalNumberOfParticipants) {
        this.guestNameList = guestNameList;
        this.totalNumberOfParticipants = totalNumberOfParticipants;

    }
}
