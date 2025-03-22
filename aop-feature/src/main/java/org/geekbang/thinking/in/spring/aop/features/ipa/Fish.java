package org.geekbang.thinking.in.spring.aop.features.ipa;

import java.util.*;

public class Fish extends Animal{
  public Fish(String type, String size, Double weight) {
    super(type, size, weight);
  }

  @Override
  public void move(String speed) {
      if ("slow".equals(speed)){
        System.out.println(type + " lazily swimming");
      }else {
        System.out.println(type + " darting frantically");
      }
  }

  @Override
  public void makeNoise() {
    if (Objects.equals(type, "Goldfish")) {
      System.out.println("swish ");
    }else {
      System.out.println("splash ");
    }
  }

}
