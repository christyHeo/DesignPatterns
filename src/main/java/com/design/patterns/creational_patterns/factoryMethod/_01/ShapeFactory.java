package com.design.patterns.creational_patterns.factoryMethod._01;

public class ShapeFactory {

  public Shape getShape(String type){
    if(type==null)
      return null;

    if(type.equalsIgnoreCase("circle"))
      return new Circle();

    if(type.equalsIgnoreCase("rectangle"))
      return new Rectangle();

    if(type.equalsIgnoreCase("square"))
      return new Square();

    return null;
  }

}
