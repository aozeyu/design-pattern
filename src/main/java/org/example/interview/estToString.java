package org.example.interview;

public class estToString {
  public static void main(String[] args) {
    Dog dog = new Dog();
    System.out.println("d:=" + dog);
  }

}
class Dog {
  public String toString() {
    return "I am a dog";
  }
}
