package com.design.patterns.creational_patterns.singleton;

import java.io.Serializable;

/*
 * 권장방법 *
 * */
public class Settings8 implements Serializable {

  private Settings8(){
    //외부에서 접근할 수 없도록 private 생성자를 만든다.
  }

  private static class SettingsHolder {
    private static final Settings8 INSTANCE = new Settings8();
  }

  public static Settings8 getInstance(){
    return Settings8.SettingsHolder.INSTANCE;
  }

  //역직렬화 대응 방안
  protected Object readResolve(){
    return getInstance();
  }

}