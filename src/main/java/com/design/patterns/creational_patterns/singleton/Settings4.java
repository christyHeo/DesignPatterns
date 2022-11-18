package com.design.patterns.creational_patterns.singleton;

/*
 * 쓰레드 세이프 하게 싱글톤 패턴을 사용하는 방법2
 * 이른 초기화(eager initialization) 사용
 * 단점: 미리 만드는 것 그 자체가 단점이 될 수 있다. (사용하지 않을 수도 있잖아..)
 * */
public class Settings4 {

  private static final Settings4 INSTANCE = new Settings4();

  private Settings4(){
    //외부에서 접근할 수 없도록 private 생성자를 만든다.
  }

  public static Settings4 getInstance(){
    return INSTANCE;
  }

}