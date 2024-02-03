package org.example.interview;

public class countWordsIteratively {




  public static void main(String[] args) {
    final String SENTENCE =
        " Nel mezzo del cammin di nostra vita " +
            "mi ritrovai in una selva oscura" +
            " ché la dritta via era smarrita ";

    System.out.println("Found " + countWordsIteratively2(SENTENCE) + " words");
  }
  public static int countWordsIteratively2(String s) {
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
