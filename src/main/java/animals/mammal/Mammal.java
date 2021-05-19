package animals.mammal;

import animals.*;

public abstract class Mammal extends Animal {

  Fur fur;
  Denture denture;

  public Mammal(
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
      int neededStability) {
    super(feedingBehavior, behaviorTowardsPeople, species, habitat, size, 2, primaryColour, secondaryColour, "Fur", continent, neededStability);
    this.fur = fur;
    this.denture = denture;
  }

  // Methods

  public Denture getDenture() {
    return denture;
  }

  public void setDenture(Denture denture) {
    this.denture = denture;
  }

  public Fur getFur() {
    return fur;
  }

  public void setFur(Fur fur) {
    this.fur = fur;
  }
}
