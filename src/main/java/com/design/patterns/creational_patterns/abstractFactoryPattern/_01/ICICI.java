package com.design.patterns.creational_patterns.abstractFactoryPattern._01;

public class ICICI implements Bank{

  private final String BNAME;

  ICICI(){
    BNAME="ICICI BANK";
  }

  @Override
  public String getBankName() {
    return BNAME;
  }

}