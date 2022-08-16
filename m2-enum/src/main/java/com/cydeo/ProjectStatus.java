package com.cydeo;

public enum ProjectStatus {

    OPEN, CLOSE,PROGRESS("IN_PROGRESS");

    String status;

    ProjectStatus(String status) {//constructor
        this.status = status;
    }

    ProjectStatus() {//constructor without value
    }

    public String getStatus() {
        return status;
    }
}
