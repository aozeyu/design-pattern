package org.example.singleton;

import java.lang.reflect.*;

public class ReflectionTest {
  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
    Class<?> c = Class.forName("org.example.singleton.PrivateTest");
    Object o = c.newInstance();
    Field field =c.getDeclaredField("name");
    field.setAccessible(true);
    field.set(o,"world");
    System.out.println(c.getName());
  }
}
