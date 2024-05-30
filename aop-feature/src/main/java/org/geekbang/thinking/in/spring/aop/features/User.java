package org.geekbang.thinking.in.spring.aop.features;


import lombok.*;

@Data
public class User implements Cloneable{
  private String username;
  private Integer age;

  public User () {
    System.out.println("User对象创建");
  }

  @Override
  protected Object clone() {
    User user = new User();
    user.setUsername(username);
    user.setAge(age);
    return user;
  }
}
