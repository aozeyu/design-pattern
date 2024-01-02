package org.example.interview;

//双重检查加锁的方式，在保证延迟初始化的同时保证线程安全。
public class Singleton {
  private volatile static Singleton instance;

  private Singleton() {
  }

  ;

  public static Singleton getInstance() {
    if (instance == null) {
      synchronized (Singleton.class) {
        if (instance == null) {
          instance = new Singleton();
        }
      }
    }
    return instance;
  }
}
