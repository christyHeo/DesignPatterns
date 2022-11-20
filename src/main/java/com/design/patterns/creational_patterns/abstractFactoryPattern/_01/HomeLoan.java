package com.design.patterns.creational_patterns.abstractFactoryPattern._01;

public class HomeLoan extends Loan{

  @Override
  void getInterestRate(double r) {
    rate=r;
  }

}
