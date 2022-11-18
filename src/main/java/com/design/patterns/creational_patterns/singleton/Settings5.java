package com.design.patterns.creational_patterns.singleton;

/*
 * 쓰레드 세이프 하게 싱글톤 패턴을 사용하는 방법3
 * double checked locking 사용
 * 단점: 이해하기가 복잡 (자바1.5부터 사용가능)
 * */
public class Settings5 {

  private static volatile Settings5 instance;

  private Settings5(){
    //외부에서 접근할 수 없도록 private 생성자를 만든다.
  }

  public static Settings5 getInstance(){
    if(instance == null){
      synchronized (Settings5.class){
        if(instance == null){
          instance = new Settings5();
        }
      }
    }
    return instance;
  }

}