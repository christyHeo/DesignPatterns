package com.design.patterns.creational_patterns.factoryMethod._02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

  public static void main(String[] args) throws IOException {
    GetPlanFactory gpf = new GetPlanFactory();

    System.out.print("Enter the name of plan for which the bill will be generated");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //Scanner
    String name = br.readLine();

    System.out.print("Enter the number of units for bill will be calculated");
    int units = Integer.parseInt(br.readLine());

    Plan p = gpf.getPlan(name);

    System.out.println(name + ", " + units);
    p.getRate();
    p.calculateBill(units);

  }

}
