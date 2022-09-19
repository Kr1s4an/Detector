package Model;

import static Model.Detector.authorshipDetector;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.math.MathContext;

public class AuthorshipDetectorImpl implements AuthorshipDetector {

  public AuthorshipDetectorImpl(InputStream signaturesDataset, double[] weights) {

  }

  public AuthorshipDetectorImpl() {

  }

  public static double AverageWordLength() throws IOException {
    Feature feature = new Feature();
    double value =
        Split.getSplitByCharacters(authorshipDetector.cleanUp(FileReader.getFile()))
            / Split.getSplitByWords(authorshipDetector.cleanUp(FileReader.getFile()));
    double averageWordLength =Math.round(value*100)/100.00;
    feature.setValue(averageWordLength);
    feature.setFeatureType(FeatureType.AVERAGE_WORD_LENGTH);
    return averageWordLength;

  }

  public static double AverageSentenceLength() throws IOException {
    Feature feature = new Feature();
    double value =
        Split.getSplitByWords(authorshipDetector.cleanUp(FileReader.getFile()))
            / Split.getSplitBySentence(authorshipDetector.cleanUp(FileReader.getFile()));
    double averageSentenceLength = Math.round(value*100)/100.00;
    feature.setValue(averageSentenceLength);
    feature.setFeatureType(FeatureType.AVERAGE_SENTENCE_LENGTH);
    return averageSentenceLength;
  }

  public static double HapaxLegomenaRatio() throws IOException {
    Feature feature = new Feature();
    double value =
        Split.getSplitByUniqueWords(authorshipDetector.cleanUp(FileReader.getFile()))
            / Split.getSplitByWords(authorshipDetector.cleanUp(FileReader.getFile()));
    double hapaxLegamenaRatio=Math.round(value*100)/100.00;
    feature.setValue(hapaxLegamenaRatio);
    feature.setFeatureType(FeatureType.HAPAX_LEGOMENA_RATIO);
    return hapaxLegamenaRatio;
  }

  public static double TypeTokenRatio() throws IOException {
    Feature feature = new Feature();
    double value =
        Split.getSplitWordsWithoutRepeating(authorshipDetector.cleanUp(FileReader.getFile()))
            / Split.getSplitByWords(authorshipDetector.cleanUp(FileReader.getFile()));
    double typeTokenRatio = Math.round(value*100)/100.00;
    feature.setValue(typeTokenRatio);
    feature.setFeatureType(FeatureType.TYPE_TOKEN_RATIO);
    return typeTokenRatio;
  }

  public static double AverageSentenceComplexity() throws IOException {
    Feature feature = new Feature();
    double value =
        Split.getSplitByPhrases(authorshipDetector.cleanUp(FileReader.getFile()))
            / Split.getSplitBySentence(authorshipDetector.cleanUp(FileReader.getFile()));
    double averageSentenceComplexity =Math.round(value*100)/100.00;
    feature.setValue(averageSentenceComplexity);
    feature.setFeatureType(FeatureType.AVERAGE_SENTENCE_COMPLEXITY);
    return averageSentenceComplexity;
  }

  public static double SumAverageWordLength() throws IOException {
    double value = Math.abs(AverageWordLength() - Split.getSplitAuthorAverageWordLength()) * 11;
    double sumAverageWordLength = Math.round(value*100)/100.00;
    return sumAverageWordLength;
  }

  public static double SumTypeTokenRatio() throws IOException {
    double value = Math.abs(TypeTokenRatio() - Split.getSplitAuthorTypeTokenRatio()) * 33;
    double sumTypeTokenRatio = Math.round(value*100)/100.00;
    return sumTypeTokenRatio;
  }

  public static double SumHapaxLegomenaRatio() throws IOException {
    double value = Math.abs(HapaxLegomenaRatio() - Split.getSplitAuthorHapaxLegomenaRatio()) * 50;
    double sumHapahLegomenaRatio = Math.round(value*100)/100.00;
    return sumHapahLegomenaRatio;
  }

  public static double SumAverageSentenceLength() throws IOException {
    double value =
        Math.abs(AverageSentenceLength() - Split.getSplitAuthorAverageSentenceLength()) * 0.4;
    double sumAverageSentenceLength = Math.round(value*100)/100.00;
    return sumAverageSentenceLength;
  }

  public static double SumAverageSentenceComplexity() throws IOException {
    double value =
        Math.abs(AverageSentenceComplexity() - Split.getSplitAuthorAverageSentenceComplexity()) * 4;
    double sumAverageSentenceComplexity = Math.round(value*100)/100.00;
    return sumAverageSentenceComplexity;
  }

  public static double SumPercentage() throws IOException {
    double sumPercentage = SumAverageWordLength() + SumTypeTokenRatio() + SumHapaxLegomenaRatio()
        + SumAverageSentenceLength() + SumAverageSentenceComplexity();
    System.out.println(sumPercentage + " %");
    return sumPercentage;
  }

  @Override
  public Object calculateSignature() throws IOException {

    return 0;
  }


  @Override
  public double calculateSimilarity(Object firstSignature, Object secondSignature) {

    return 0;
  }

  @Override
  public String findAuthor(InputStream mysteryText) {

    return null;
  }

  @Override
  public String cleanUp(String word) {
    {
      return word.toLowerCase()
          .replaceAll(
              "^[!.,:;\\-?<>#\\*\'\"\\[\\(\\]\\)\\n\\t\\\\]+|[!.,:;\\-?<>#\\*\'\"\\[\\(\\]\\)\\n\\t\\\\]+$",
              " ");
    }
  }
}