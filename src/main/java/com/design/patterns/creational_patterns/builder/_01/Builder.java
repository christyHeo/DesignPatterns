package com.design.patterns.creational_patterns.builder._01;

public class Builder {

  public static void main(String[] args)
  {
    HouseBuilder iglooBuilder = new IglooHouseBuilder();
    CivilEngineer engineer = new CivilEngineer(iglooBuilder);

    engineer.constructHouse();

    House house = engineer.getHouse();

    System.out.println("Builder constructed: "+ house);
  }

}
