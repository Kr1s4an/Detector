package Model;

import java.io.IOException;
import java.util.Scanner;

public class Split {
  public static Scanner scanner = new Scanner(System.in);
  public static void getSplitByWords(String text) throws IOException {
    String[] words = text.split(" ");

    for (String word : words)
      System.out.println(word);

  }
}
