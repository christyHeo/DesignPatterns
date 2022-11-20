package com.design.patterns.creational_patterns.abstractFactoryPattern._01;

public class EducationLoan extends Loan{

  @Override
  void getInterestRate(double r) {
    rate=r;
  }

}
