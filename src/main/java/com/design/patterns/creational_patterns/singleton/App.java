package com.design.patterns.creational_patterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

    Settings settings1 = new Settings();
    Settings settings2 = new Settings();
    System.out.println(settings1 != settings2);
    //싱글톤 패턴을 구현하기 위해서는 new 연산자를 절대 사용하면 안된다.

    //Settings2 settings3 = new Settings2();
    //private 생성자는 new 연산자 사용 불가

    Settings2 settings4 = Settings2.getInstance();
    Settings2 settings5 = Settings2.getInstance();
    System.out.println(settings4 == settings5);


    //잘못 사용할 경우 싱글톤이 깨지게된다....

    //1) 리플렉션 사용할 경우
    Settings6 settings6 = Settings6.getInstance();

    Constructor<Settings6> constructor = Settings6.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    Settings6 settings7 = constructor.newInstance();
    System.out.println(settings6 == settings7); //false

    //2) 직렬화, 역직렬화 사용할 경우
    Settings7 settings8 = Settings7.getInstance();
    Settings7 settings9 = null;

    try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
      out.writeObject(settings8);
    }

    //역직렬화
    try(ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
      settings9 = (Settings7) in.readObject();
    }

    System.out.println(settings8 == settings9); //false



    //1-1) 리플렉션 대응 방안
    Settings9 settings66 = Settings9.INSTANCE;


    //2-1) 역직렬화 대응 방안
    Settings8 settings88 = Settings8.getInstance();
    Settings8 settings99 = null;

    try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
      out.writeObject(settings88);
    }

    //역직렬화
    try(ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
      settings99 = (Settings8) in.readObject();
    }

    System.out.println(settings88 == settings99); //true
  }

}
