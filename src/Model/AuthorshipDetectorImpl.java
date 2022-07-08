package Model;

import java.io.InputStream;

public class AuthorshipDetectorImpl implements AuthorshipDetector {
  public AuthorshipDetectorImpl(InputStream signaturesDataset, double[] weights){

  }

  @Override
  public Object calculateSignature(InputStream mysteryText) {
    return null;
  }

  @Override
  public double calculateSimilarity(Object firstSignature, Object secondSignature) {
    return 0;
  }

  @Override
  public String findAuthor(InputStream mysteryText) {
    return null;
  }
}
