package Model;

import java.io.InputStream;

public interface AuthorshipDetector<LinguisticSignature> {

  LinguisticSignature calculateSignature(InputStream mysteryText);

  double calculateSimilarity(LinguisticSignature firstSignature, LinguisticSignature secondSignature);

  String findAuthor(InputStream mysteryText);


}
