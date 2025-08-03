package com.devgen.model;

public class Engine
{
    private String type;
    private int cylinders;

    public Engine() {
        // Default constructor
        System.out.println("Default Engine constructor called");
    }

    public Engine(String type, int cylinders) {
        this.type = type;
        this.cylinders = cylinders;
    }

    // This is setter injection
    public void setType(String type) {
        System.out.println("Setting engine type: " + type);
        this.type = type;
    }

    public String getType() {
        return type;
    }


    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }
}
