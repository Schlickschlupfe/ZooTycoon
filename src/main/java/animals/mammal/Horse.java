package animals.mammal;

import animals.Colouring;
import animals.Continent;
import animals.Denture;
import animals.Habitat;

public class Horse extends Ungulate {

  Mane mane;
  Blaze blaze;
  private String race;

  // Constructors

  public Horse(double size, Colouring colouring, Mane mane, Blaze blaze, String race) {
    super(
        "horse",
        Habitat.DOMESTICATED,
        size,
        colouring,
        Fur.SHORT,
        Denture.VEGETARIAN,
        Continent.EUROPE,
        false);
    this.setMane(mane);
    this.setBlaze(blaze);
    this.setRace(race);
  }

  @Override
  public void eat() {
    System.out.println("The horse loves hay");
  }

  @Override
  public void sleep() {
    System.out.println("The horse can sleep standing and it only lies down when it feels save.");
  }

  public Mane getMane() {
    return mane;
  }

  public void setMane(Mane mane) {
    this.mane = mane;
  }

  public Blaze getBlaze() {
    return blaze;
  }

  public void setBlaze(Blaze blaze) {
    this.blaze = blaze;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }
}
