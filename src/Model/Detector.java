package Model;

import ReturnAnswer.Communicator;
import getText.GetText;
import java.util.Scanner;

public class Detector {

  static Scanner scanner = new Scanner(System.in);

  public static void start() {
    Communicator.communicate();
    Communicator.getAmountOfTexts();
    AmountOfTexts(scanner.nextInt());

  }

  public static void AmountOfTexts(int numberOfTheAmount) {
    String[] texts = new String[numberOfTheAmount];
    for (int i = 0; i < texts.length; i++) {
      Communicator.getInputText();
      texts[i] = GetText.getInputText();
    }
  }

}
