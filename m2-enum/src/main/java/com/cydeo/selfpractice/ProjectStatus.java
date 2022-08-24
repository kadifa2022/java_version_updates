package com.cydeo.selfpractice;

public enum ProjectStatus {

    OPEN,CLOSED,PROGRESS("IN_PROGRESS");  //constants without value
    String status;

    ProjectStatus(String status) {
        this.status = status;
    }

    ProjectStatus() { // generate constructor without any value for constants
    }
}
