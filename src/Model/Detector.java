package Model;

import ReturnAnswer.Communicator;
import getText.GetText;

public class Detector {
public static void start(){
  Communicator.communicate();
  Communicator.getAmountOfTexts();
  Communicator.getInputText();
  System.out.println(GetText.getInputText());
}
public static void AmountOfTexts(int numberOfTheAmount){
  for (int i = 0; i < numberOfTheAmount; i++) {

  }

}
}
