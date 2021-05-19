package animals.mammal;

import animals.*;

public class Horse extends Ungulate {

  Mane mane;
  Blaze blaze;
  private String race;

  // Constructors

  public Horse(double size, Colouring primaryColour, Colouring secondaryColour, Mane mane, Blaze blaze, String race) {
    super(
        Climate.MODERATE,
        FeedingBehavior.HERBIVORE,
        BehaviorTowardsPeople.TRUSTING,
        "horse",
        Habitat.DOMESTICATED,
        size,
        primaryColour,
        secondaryColour,
        Fur.SHORT,
        Denture.VEGETARIAN,
        Continent.EUROPE,
        false,
            3);
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
