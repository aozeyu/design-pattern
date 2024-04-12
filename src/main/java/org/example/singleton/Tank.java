package org.example.singleton;

import java.util.*;

public class Tank {
  public static void main(String[] args) {
    List<TankEntity> list = new ArrayList<>();
    TankEntity tankEntity2 = new TankEntity();
    tankEntity2.setName("坦克2号");
    tankEntity2.setIndex(2);
    list.add(tankEntity2);

    TankEntity tankEntity1 = new TankEntity();
    tankEntity1.setName("坦克1号");
    tankEntity1.setIndex(1);
    list.add(tankEntity1);

    System.out.println(list);
  }
}
