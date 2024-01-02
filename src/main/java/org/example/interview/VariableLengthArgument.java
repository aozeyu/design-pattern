package org.example.interview;

public class VariableLengthArgument {
  public static void printVariable(String... args) {
    for (String s : args) {
      System.out.println(s);
    }
  }

  public static void printVariable(String arg1,String arg2) {
    System.out.println(arg1 + arg2);
  }

  public static void main(String[] args) {
    //方法重载执行两个参数的方法
    printVariable("a","b");
    //
    printVariable("a","b","c","d");
  }
}
