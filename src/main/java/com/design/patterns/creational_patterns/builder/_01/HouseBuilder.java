package com.design.patterns.creational_patterns.builder._01;

public interface HouseBuilder {

  public void buildBasement();

  public void buildStructure();

  public void buildRoof();

  public void buildInterior();

  public House getHouse();

}
