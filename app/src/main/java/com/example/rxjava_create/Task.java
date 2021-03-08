package com.example.rxjava_create;

public class Task {

    String projectName;
    int priority;
    boolean inComplete;

    public Task(String projectName, int priority, boolean inComplete) {
        this.projectName = projectName;
        this.priority = priority;
        this.inComplete = inComplete;
    }

    public String getProjectName() {
        return projectName;
    }
}
