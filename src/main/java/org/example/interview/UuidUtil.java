package org.example.interview;

import java.util.*;

public class UuidUtil {
  public static String createUUID() {
    return UUID.randomUUID().toString().replaceAll("-", "");
  }

  public static long createIDForLong() {
    return System.currentTimeMillis();
  }

  public static void main(String[] args) {
    UuidUtil.createUUID();
  }
}
