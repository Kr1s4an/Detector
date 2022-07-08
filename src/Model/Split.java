package Model;

import java.util.Scanner;

public class Split {
  public static Scanner scanner = new Scanner(System.in);
  public static void getSplitByWords() {
    String text = scanner.nextLine();
    String[] words = text.split(" ");

    for (String word : words)
      System.out.println(word);

  }
}
