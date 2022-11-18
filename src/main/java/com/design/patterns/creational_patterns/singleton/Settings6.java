package com.design.patterns.creational_patterns.singleton;

/*
 * 쓰레드 세이프 하게 싱글톤 패턴을 사용하는 방법4
 * static inner 클래스 사용
 * */
public class Settings6 {

  private Settings6(){
    //외부에서 접근할 수 없도록 private 생성자를 만든다.
  }

  private static class SettingsHolder {
    private static final Settings6 INSTANCE = new Settings6();
  }

  public static Settings6 getInstance(){
    return SettingsHolder.INSTANCE;
  }

}