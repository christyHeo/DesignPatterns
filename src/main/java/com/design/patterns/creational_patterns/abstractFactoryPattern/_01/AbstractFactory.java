package com.design.patterns.creational_patterns.abstractFactoryPattern._01;

abstract class AbstractFactory {

  public abstract Bank getBank(String bank);
  public abstract Loan getLoan(String loan);

}
