package Model;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReader {


  public FileReader(Object s) {

  }


  public static String getFile() throws IOException {

    File fileName = new File(
        "C:/Users/Krisi/Desktop/IJ/Detector/src/resources/mysteryFiles/mystery2.txt");

    try (FileInputStream fileInputStream = new FileInputStream(fileName)) {

      int i = 0;
      do {

        byte[] buffer = new byte[(int) fileName.length()];
        i = fileInputStream.read(buffer);

        String value = new String(buffer, StandardCharsets.UTF_8);
        return value;

      } while (i != -1);


    }

  }
  public static String getFileAuthor() throws IOException {

    File fileName = new File(
        "C:/Users/Krisi/Desktop/IJ/Detector/src/resources/knownSignatures.txt");

    try (FileInputStream fileInputStream = new FileInputStream(fileName)) {

      int i = 0;
      do {

        byte[] buffer = new byte[(int) fileName.length()];
        i = fileInputStream.read(buffer);

        String value = new String(buffer, StandardCharsets.UTF_8);

        return value;
      } while (i != -1);


    }

  }
}

