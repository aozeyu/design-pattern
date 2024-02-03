package org.example.interview;

public class countWordsIteratively {
  public int countWordsIteratively2(String s) {
    int count = 0;
    boolean lastSpace = true;
    for (char c : s.toCharArray()) {
      if (Character.isWhitespace(c)) {
        lastSpace = true;
      }else  {
        if (lastSpace) count ++;
        lastSpace = false;
      }
    }
    return count;
  }
}
