package Model;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Split {

  public static Scanner scanner = new Scanner(System.in);
  public static double getSplitByWords(String text) throws IOException {
    String[] words = text.split(" ");
    int sumOfAllWords = words.length;

    return sumOfAllWords;
  }


  public static double getSplitByCharacters(String text) throws IOException {
    String[] words = text.split(" ");
    int sumOfAllCharacters = 0;
    for (String word : words) {
      sumOfAllCharacters += word.length();

    }

    return sumOfAllCharacters;
  }
  public static double getSplitBySentence(String text) throws IOException {
    String[] sentences = text.split("(?<=[a-z])\\.\\s+");
    return sentences.length;
  }
  public static double getSplitByUniqueWords(String text) throws IOException{
    int wordCount = 0;
    int count;
    String[] words = text.split("\\W");
    for (int i = 0; i < words.length; i++) {
      count = 1;
      for (int j =i + 1; j < words.length; j++) {
        if (words[i].equalsIgnoreCase(words[j])){
          count++;
          words[j]="";
        }
      }
      if (count == 1 && words[i]!=""){
        wordCount++;
      }
    }

    return wordCount;

  }
  public static double getSplitWordsWithoutRepeating(String text)throws IOException{
    int wordCount=0;
    String[] words = text.split("\\W+");
    TreeSet<String> treeSet = new TreeSet<>();
    for (int i = 0; i < words.length; i++) {
      if (!treeSet.contains(words[i])) {
        treeSet.add(words[i]);
      }
    }

    for (String listEl : treeSet) {
      wordCount++;
    }

    return wordCount;
  }
  public static double getSplitByPhrases(String text)throws IOException{
  String[] phrases = text.split("[:,;]+(?=\\s|$)");
    return phrases.length;
  }
  public static void getSplitAuthors(String text)throws IOException{
    String[] authors = text.split("[\r\n]+");
    for(String author : authors ){

    }
  }
  public static void getSplitAuthorsByParametеrs(String fileAuthor)throws IOException{
    String[] parameters = FileReader.getFileAuthor().split("[\r\n,]");
    String authorName = parameters[0];
    String authorAverageWordLength = parameters[1];
    String authorTypeTokenRatio = parameters[2];
    String authorHapaxLegomenaRatio = parameters[3];
    String authorAverageSentenceLength = parameters[4];
    String authorAverageSentenceComplexity = parameters[5];
  }
  public static double getSplitAuthorsName()throws IOException {
    String[] parameters = FileReader.getFileAuthor().split("[\r\n,]");
    double authorName = Double.parseDouble(parameters[0]);
    return authorName;
  }
  public static double getSplitAuthorAverageWordLength()throws IOException {
    String[] parameters = FileReader.getFileAuthor().split("[\r\n,]");
    double value = Double.parseDouble(parameters[1]);
    double authorAverageWordLength=Math.round(value*100)/100.00;
    System.out.println(authorAverageWordLength);
    return authorAverageWordLength;
  }
  public static double getSplitAuthorAverageSentenceLength()throws IOException {
    String[] parameters = FileReader.getFileAuthor().split("[\r\n,]");
    double value = Double.parseDouble(parameters[4]);
    double authorAverageSentenceLength = Math.round(value*100)/100.00;
    System.out.println(authorAverageSentenceLength);
    return authorAverageSentenceLength;
  }
  public static double getSplitAuthorHapaxLegomenaRatio()throws IOException {
    String[] parameters = FileReader.getFileAuthor().split("[\r\n,]");
    double value = Double.parseDouble(parameters[3]);
    double authoraHapaxLegomenaRatio=Math.round(value*100)/100.00;
    System.out.println(authoraHapaxLegomenaRatio);
    return authoraHapaxLegomenaRatio;
  }
  public static double getSplitAuthorTypeTokenRatio()throws IOException {
    String[] parameters = FileReader.getFileAuthor().split("[\r\n,]");
    double value = Double.parseDouble(parameters[2]);
    double authorTypeTokenRatio=Math.round(value*100)/100.00;
    System.out.println(authorTypeTokenRatio);
    return authorTypeTokenRatio;
  }
  public static double getSplitAuthorAverageSentenceComplexity()throws IOException {
    String[] parameters = FileReader.getFileAuthor().split("[\r\n,]");
    double value = Double.parseDouble(parameters[5]);
    double authorAverageSentenceComplexity=Math.round(value*100)/100.00;
    System.out.println(authorAverageSentenceComplexity);
    return authorAverageSentenceComplexity;
  }
}



