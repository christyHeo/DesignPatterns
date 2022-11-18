package com.design.patterns.creational_patterns.singleton;

/*
 * 쓰레드 세이프 하게 싱글톤 패턴을 사용하는 방법1
 * synchronized 사용
 * 단점: getInstance()메서드가 호출될 때마다 성능저하 문제 발생
 * */
public class Settings3 {

  private static Settings3 instance;

  private Settings3(){
    //외부에서 접근할 수 없도록 private 생성자를 만든다.
  }

  public static synchronized Settings3 getInstance(){
    if(instance==null)
      instance = new Settings3();

    return instance;
  }

}