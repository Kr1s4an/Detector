package Model;

public class Split {

  public static void getSplitWords() {
    String test = "My first arg test";
    String[] words = test.split(" ");

    for (String word : words)
      System.out.println(word);
    /*String str = "Hey this is Ram";
    String [] words = str. split(" ", 3);
    for (String word : words)
      System. out. println(word);*/
  }
}
