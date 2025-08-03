package com.devgen.model;

public class Car
{
    private String name;
    private String color;
    private Engine engine;
//
//    public Car(String name , String color, Engine engine) {
//        this.name = name;
//        this.color = color;
//        this.engine = engine;  // here we are using constructor injection
//    }

    public Car()
    {
        // Default constructor
      //  System.out.println("Default Car constructor called");
    }

    public Car(Engine engine)
    {
        this.engine = engine;  // here we are using constructor injection

    }

    public void setName(String name) {
        this.name = name;        // if we dont have setter method then we can use constructor injection
    }

    public String getName() {
        return name;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setEngine(Engine engine) {
        System.out.println("Setting engine: " + engine);
        this.engine = engine;
    }                                    //here we are using constructor injection
    public Engine getEngine() {

        return engine;
    }
}
