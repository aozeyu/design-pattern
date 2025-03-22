package org.geekbang.thinking.in.spring.aop.features.ipa;

import java.util.*;

public class Main {
  public static void main(String[] args) {
      // Animal animal = new Animal("animal","big",100);
    Dog dog = new Dog("wolf","big", 100.0);
    dog.makeNoise();
    doAnimalStuff(dog);
    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(dog);
    animals.add(new Dog("German Shepherd","big",150.0));
    animals.add(new Fish("Goldfish","small",1.0));
    animals.add(new Fish("Barracuda","big",75.0));
    animals.add(new Dog("Pug","small",20.0));
    for (Animal animal : animals) {
      doAnimalStuff(animal);
    }
  }
  private static void doAnimalStuff(Animal animal){
    animal.makeNoise();
    animal.move("slow");
  }
}
