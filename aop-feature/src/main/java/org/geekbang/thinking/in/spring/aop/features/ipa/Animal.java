package org.geekbang.thinking.in.spring.aop.features.ipa;

public abstract class Animal {

  protected String name;
  private String size;
  private Double weight;

  public Animal(String name, String size, Double weight) {
    this.name = name;
    this.size = size;
    this.weight = weight;
  }

  public abstract void  move(String speed);
  public abstract void makeNoise();
}
