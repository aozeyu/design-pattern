package org.geekbang.thinking.in.spring.aop.features.ipa;

/**
 * @author yaozeyu
 */
public abstract class Animal {

  protected String type;
  private String size;
  private Double weight;

  public Animal(String type, String size, Double weight) {
    this.type = type;
    this.size = size;
    this.weight = weight;
  }

  public abstract void  move(String speed);
  public abstract void makeNoise();
  public String getExplicitType(){
    return getClass().getSimpleName() + "(" + type +")";
  }
}
