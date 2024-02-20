package org.example.singleton;

public class Singleton {
  //1 .构造器私有化
  private Singleton() {

  }

  private static final Singleton instance = new Singleton();

  public static Singleton getInstance() {
    return instance;
  }
}
