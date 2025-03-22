package org.geekbang.thinking.in.spring.aop.features.ipa;

import java.util.*;

public class Dog extends Animal{
  public Dog(String type, String size, Double weight) {
    super(type, size, weight);
  }

  @Override
  public void move(String speed) {
      if ("slow".equals(speed)){
        System.out.println(getExplicitType() + " walking");
      }else {
        System.out.println(getExplicitType() + " running");
      }
  }

  @Override
  public void makeNoise() {
    if (Objects.equals(type, "wolf")) {
      System.out.println("Howling");
    }else {
      System.out.println("wolf");
    }
  }

}
