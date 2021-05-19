package animals.mammal;

import animals.*;

public abstract class Ungulate extends Mammal {

  // Properties

  private boolean biungulates;
  private boolean unpairedUngulates;

  // Constructors

  public Ungulate(
      Climate climate,
      FeedingBehavior feedingBehavior,
      BehaviorTowardsPeople behaviorTowardsPeople,
      String species,
      Habitat habitat,
      double size,
      Colouring primaryColour,
      Colouring secondaryColour,
      Fur fur,
      Denture denture,
      Continent continent,
      boolean biungulates,
      int neededStability) {
    super(climate, feedingBehavior, behaviorTowardsPeople, species, habitat, size, primaryColour, secondaryColour, fur, denture, continent, neededStability);
    this.setBiungulates(biungulates);
  }

  // Methods

  @Override
  public void move() {
    System.out.println("The " + getSpecies() + " is moving on four legs.");
  }

  @Override
  public abstract void eat();

  @Override
  public abstract void sleep();

  // Getter and Setter

  public boolean isBiungulates() {
    return biungulates;
  }

  public void setBiungulates(boolean biungulates) {
    this.biungulates = biungulates;
  }

  public boolean isUnpairedUngulates() {
    return unpairedUngulates;
  }

  public void setUnpairedUngulates(boolean unpairedUngulates) {
    this.unpairedUngulates = unpairedUngulates;
  }
}
