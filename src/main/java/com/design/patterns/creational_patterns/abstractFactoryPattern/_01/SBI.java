package com.design.patterns.creational_patterns.abstractFactoryPattern._01;

public class SBI implements Bank{

  private final String BNAME;

  public SBI(){
    BNAME="SBI BANK";
  }

  @Override
  public String getBankName(){
    return BNAME;
  }
}