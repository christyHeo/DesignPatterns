package com.design.patterns.creational_patterns.factoryMethod._01;

/*
Factory pattern is one of the most used design patterns in Java.
This type of design pattern comes under creational pattern
as this pattern provides one of the best ways to create an object.
In Factory pattern, we create object without exposing the creation logic
to the client and refer to newly created object using a common interface.
*/

public class FactoryPatternDemo {

  public static void main(String[] args){
    ShapeFactory sf = new ShapeFactory();

    Shape shape1 = sf.getShape("circle");
    shape1.draw();

    Shape shape2 = sf.getShape("rectangle");
    shape2.draw();

    Shape shape3 = sf.getShape("square");
    shape3.draw();
  }

}
