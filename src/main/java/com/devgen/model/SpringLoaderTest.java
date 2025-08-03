package com.devgen.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLoaderTest
{
    public static void main(String[] args) {
         //here Start the Ioc container by reading the spring.xml file
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

       // Engine engine = context.getBean(Engine.class);
        Engine engine1 = context.getBean("engine" , Engine.class);
        Engine enginea1 = context.getBean("engine" , Engine.class);
         Engine engine2 = context.getBean("engine2", Engine.class);
         //here we getting in output 2 different objects of Engine class
        //here not singleton bean applicable because we are using prototype scope in spring.xml file
      System.out.println("Engine 1: " + engine1);
        System.out.println("Engine 2: " + engine2);  // This will print different object references
        System.out.println("Engine Type: " + engine1.getType());
        System.out.println("Engine Cylinders: " + engine1.getCylinders());
      // Here in Bean id is unique so we can get the different objects

        // now we can get the same object reference of Engine class
        Engine engine3 = context.getBean("engine2", Engine.class);
        Engine engine4 = context.getBean("engine2", Engine.class);
        System.out.println("Engine 3: " + engine3);  // This will print the same object reference as engine1
        System.out.println("Engine 4: " + engine4);  // This will print the same object reference as engine1

        //When we use scope prototype in spring.xml file then we get different object references
        System.out.println("Engine 3 and Engine 4 are same object: " + (engine1 == enginea1)); // This will be false


        Car car=context.getBean("car",Car.class); // This will trigger the Car bean creation

        System.out.println("Car Name: " + car.getName());
        System.out.println("Car Color: " + car.getColor());
        System.out.println("----------------------------");
        System.out.println("Car Engine: " + car.getEngine()); // This will print the engine object reference

    }
}
