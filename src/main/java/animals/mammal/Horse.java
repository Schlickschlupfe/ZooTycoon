package animals.mammal;

import animals.Continent;
import animals.Denture;
import animals.Fur;

public class Horse extends Ungulate {

  // Properties

  private String maneLength;
  private String blaze;
  private String race;

  // Constructors

  public Horse(double size, String colour, String maneLength, String blaze, String race) {
    super(
        "horse",
        "grasland, domesticated",
        size,
        colour,
        createFur(),
        createDenture(),
        Continent.EUROPE,
        false);
    this.setManeLength(maneLength);
    this.setBlaze(blaze);
    this.setRace(race);
  }

  // Methods

  private static Fur createFur() {
    return new Fur(false, false, false);
  }

  private static Denture createDenture() {
    return new Denture(44, true, false, false);
  }

  @Override
  public void eat() {
    System.out.println("The horse loves hay");
  }

  @Override
  public void sleep() {
    System.out.println("The horse can sleep standing and it only lies down when it feels save.");
  }

  // Getter and Setter

  public String getManeLength() {
    return maneLength;
  }

  public void setManeLength(String maneLength) {
    this.maneLength = maneLength;
  }

  public String getBlaze() {
    return blaze;
  }

  public void setBlaze(String blaze) {
    this.blaze = blaze;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }
}
