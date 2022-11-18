package com.design.patterns.creational_patterns.singleton.usage;

public class RuntimeExample {

  public static void main(String[] args){

    //Runtime runtime = new Runtime();

    Runtime runtime2 = Runtime.getRuntime();
    System.out.println(runtime2.maxMemory());
    System.out.println(runtime2.freeMemory());

  }

}
