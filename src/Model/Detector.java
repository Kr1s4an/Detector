package Model;

import ReturnAnswer.Communicator;
import getText.GetText;
import java.io.IOException;
import java.util.Scanner;

public class Detector {

  static AuthorshipDetectorImpl authorshipDetector = new AuthorshipDetectorImpl();

  public Detector() throws IOException {
    start();
  }

  static Scanner scanner = new Scanner(System.in);

  public static void start() throws IOException {
    //Communicator.communicate();
    //Communicator.getAmountOfTexts();
    //AmountOfTexts(scanner.nextInt());
    //Split.getSplitIntoParagraph(FileReader.getFile());
    //Split.getSplitByCharacters(authorshipDetector.cleanUp(FileReader.getFile()));
    //Split.getSplitByWords(authorshipDetector.cleanUp(FileReader.getFile()));
    //Split.getSplitBySentence(authorshipDetector.cleanUp(FileReader.getFile()));
    //Split.getSplitByUniqueWords((authorshipDetector.cleanUp(FileReader.getFile())));
    //Split.getSplitAndPrintWordOnlyOnce(authorshipDetector.cleanUp(FileReader.getFile()));
    //Split.getSplitByPhrases(FileReader.getFile());
    //Split.getSplitAuthors(FileReader.getFileAuthor());
    Split.getSplitAuthorsByParametеrs(FileReader.getFileAuthor());
    //authorshipDetector.AverageWordLength();
    //.TypeTokenRatio();
    //authorshipDetector.HapaxLegomenaRatio();
    //authorshipDetector.AverageSentenceLength();
    //authorshipDetector.AverageSentenceComplexity();
    //AuthorshipDetectorImpl.SumAverageWordLength();
    //Split.getSplitAuthorAverageWordLength();
    //Split.getSplitAuthorTypeTokenRatio();
    //Split.getSplitAuthorHapaxLegomenaRatio();
    //Split.getSplitAuthorAverageSentenceLength();
    //Split.getSplitAuthorAverageSentenceComplexity();
    //AuthorshipDetectorImpl.SumPercentage();
  }


}
