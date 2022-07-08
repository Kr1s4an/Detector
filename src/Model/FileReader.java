package Model;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReader {


  public FileReader(Object s) {

  }


  public static void getFile() throws IOException {

    String fileName = "C:/Users/Krisi/Desktop/IJ/Detector/src/resources/mysteryFiles/mystery1.txt";

    try (FileInputStream fis = new FileInputStream(fileName)) {


      int i = 0;

      do {

        byte[] buf = new byte[1024];
        i = fis.read(buf);

        String value = new String(buf, StandardCharsets.UTF_8);
        System.out.print(value);

      } while (i != -1);


    }

  }
}

