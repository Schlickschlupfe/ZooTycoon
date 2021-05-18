package animals.reptile;

import animals.Animal;
import animals.Colouring;
import animals.Continent;
import animals.Habitat;

public abstract class Reptile extends Animal {
  // Properties
  private final boolean molting;
  private final boolean moveSpreading;

  // Constructors
  public Reptile(
      String species,
      Habitat habitat,
      double size,
      Colouring primaryColour,
      Colouring secondaryColour,
      String skinType,
      Continent whichContinent,
      boolean molting,
      boolean moveSpreading) {
    super(species, habitat, size, 2, primaryColour, secondaryColour, skinType, whichContinent);
    this.molting = molting;
    this.moveSpreading = moveSpreading;
  }

  public boolean isMolting() {
    return molting;
  }

  public boolean isMoveSpreading() {
    return moveSpreading;
  }
}
