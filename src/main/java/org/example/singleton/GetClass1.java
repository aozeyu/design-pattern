package org.example.singleton;

public class GetClass1 {
  public static void main(String[] args) {
    User user = new User();
    Class<? extends User> clazz =  user.getClass();
    Class<? extends User> clazz2 = user.getClass();
    System.out.println(clazz);
    System.out.println(clazz.getName());
    System.out.println(clazz == clazz2);
  }
}
