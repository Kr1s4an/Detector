package Model;

public class Feature {
  FeatureType featureType;
double value;

public Feature(){

}

  public FeatureType getFeatureType() {
    return featureType;
  }

  public void setFeatureType(FeatureType featureType) {
    this.featureType = featureType;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }
}
