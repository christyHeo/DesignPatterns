package com.design.patterns.creational_patterns.factoryMethod._02;

public class GetPlanFactory {

  public Plan getPlan(String type) {
    if(type==null)
      return null;

    if(type.equalsIgnoreCase("domestic")) {
      return new DomesticPlan();

    } else if (type.equalsIgnoreCase("commercial")) {
      return new CommercialPlan();

    } else if (type.equalsIgnoreCase("institutional")) {
      return new InstitutionalPlan();

    }

    return null;
  }


}
