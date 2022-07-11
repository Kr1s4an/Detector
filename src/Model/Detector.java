package Model;

import ReturnAnswer.Communicator;
import getText.GetText;
import java.io.IOException;
import java.util.Scanner;

public class Detector {
  public Detector() throws IOException {
    start();
  }

  static Scanner scanner = new Scanner(System.in);

  public static void start() throws IOException {
   // Communicator.communicate();
   // Communicator.getAmountOfTexts();
    //AmountOfTexts(scanner.nextInt());
    Split.getSplitByWords(FileReader.getFile());
  }

  public static void AmountOfTexts(int numberOfTheAmount) {
    String[] texts = new String[numberOfTheAmount];
    for (int i = 0; i < texts.length; i++) {
      Communicator.getInputText();
      texts[i] = GetText.getInputText();
    }
  }


}
