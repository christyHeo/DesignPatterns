package com.design.patterns.creational_patterns.abstractFactoryPattern._01;

public class HDFC implements Bank{

  private final String BNAME;

  public HDFC(){
    BNAME="HDFC BANK";
  }

  @Override
  public String getBankName(){
    return BNAME;
  }

}
