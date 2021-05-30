package com.example.myapplicationtodolist.models;

public class Taches {

private String taches;
private String priority;

    public Taches(String taches, String priority) {
        this.taches = taches;
        this.priority = priority;
    }

    public String getTaches() {
        return taches;
    }

    public void setTaches(String taches) {
        this.taches = taches;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
