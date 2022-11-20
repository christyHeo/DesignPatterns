package com.design.patterns.creational_patterns.factoryMethod;

public class Client {

  public static void main(String[] args){
    Client client = new Client();

    Ship whiteship = ShipFactory.orderShip("whiteship", "whiteship@gamil.com");

    Ship blackship = ShipFactory.orderShip("blackship", "blackship@gamil.com");

  }

}
