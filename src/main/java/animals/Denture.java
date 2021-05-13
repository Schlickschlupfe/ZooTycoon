package animals;

public class Denture {

  // Properties

  private int teethNumber;
  private boolean teethVegetarian;
  private boolean teethCarnivore;
  private boolean teethOmnivore;

  // Constructors

  public Denture(
      int teethNumber, boolean teethVegetarian, boolean teethCarnivore, boolean teethOmnivore) {
    this.setTeethNumber(teethNumber);
    this.setTeethVegetarian(teethVegetarian);
    this.setTeethCarnivore(teethCarnivore);
    this.setTeethOmnivore(teethOmnivore);
  }

  // Methods

  // Getter and Setter

  public int getTeethNumber() {
    return teethNumber;
  }

  public void setTeethNumber(int teethNumber) {
    this.teethNumber = teethNumber;
  }

  public boolean isTeethVegetarian() {
    return teethVegetarian;
  }

  public void setTeethVegetarian(boolean teethVegetarian) {
    this.teethVegetarian = teethVegetarian;
  }

  public boolean isTeethCarnivore() {
    return teethCarnivore;
  }

  public void setTeethCarnivore(boolean teethCarnivore) {
    this.teethCarnivore = teethCarnivore;
  }

  public boolean isTeethOmnivore() {
    return teethOmnivore;
  }

  public void setTeethOmnivore(boolean teethOmnivore) {
    this.teethOmnivore = teethOmnivore;
  }
}
