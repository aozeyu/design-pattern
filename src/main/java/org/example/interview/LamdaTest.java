package org.example.interview;

import java.util.*;

public class LamdaTest {
  public static void main(String[] args) {
    List<String> str = Arrays.asList("a","b","A","B");
    str.sort(String::compareToIgnoreCase);
    System.out.println(str);
  }
}
