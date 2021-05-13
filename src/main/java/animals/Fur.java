package animals;

public class Fur {

  // Properties

  private boolean furCamouflage;
  private boolean furWarning;
  private boolean furGenderDifference;

  // Constructors

  public Fur(boolean camouflage, boolean warning, boolean genderDifference) {
    setFurCamouflage(camouflage);
    setFurWarning(warning);
    setFurGenderDifference(genderDifference);
  }

  // Methods

  // Getter and Setter

  public boolean isFurCamouflage() {
    return furCamouflage;
  }

  public void setFurCamouflage(boolean furCamouflage) {
    this.furCamouflage = furCamouflage;
  }

  public boolean isFurWarning() {
    return furWarning;
  }

  public void setFurWarning(boolean furWarning) {
    this.furWarning = furWarning;
  }

  public boolean isFurGenderDifference() {
    return furGenderDifference;
  }

  public void setFurGenderDifference(boolean furGenderDifference) {
    this.furGenderDifference = furGenderDifference;
  }
}
