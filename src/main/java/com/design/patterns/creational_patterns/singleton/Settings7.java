package com.design.patterns.creational_patterns.singleton;

import java.io.Serializable;

public class Settings7 implements Serializable {

  private Settings7(){
    //외부에서 접근할 수 없도록 private 생성자를 만든다.
  }

  private static class SettingsHolder {
    private static final Settings7 INSTANCE = new Settings7();
  }

  public static Settings7 getInstance(){
    return Settings7.SettingsHolder.INSTANCE;
  }

}