package Model;

import java.io.IOException;
import java.io.InputStream;

public interface AuthorshipDetector<LinguisticSignature> {

  LinguisticSignature calculateSignature() throws IOException;

  double calculateSimilarity(LinguisticSignature firstSignature, LinguisticSignature secondSignature);

  String findAuthor(InputStream mysteryText);

   String cleanUp(String word);

}
