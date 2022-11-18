package com.design.patterns.creational_patterns.singleton;

/*
 * 가장 나이브하게 싱글톤 패턴을 구현하는 방법
 * private 생성자와 클래스 메서드를 사용
 * 문제점: 쓰레드 세이프하지 않다!!!
 * */
public class Settings2 {

  private static Settings2 instance;

  private Settings2(){
    //외부에서 접근할 수 없도록 private 생성자를 만든다.
  }

  public static Settings2 getInstance(){
    if(instance==null)
      instance = new Settings2();

    return instance;
  }

}