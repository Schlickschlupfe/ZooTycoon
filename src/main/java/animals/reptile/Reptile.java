package animals.reptile;

import animals.Animal;
import animals.Continent;

public abstract class Reptile extends Animal {
  // Properties
  private final boolean molting;
  private final boolean moveSpreading;

  // Constructors
  public Reptile(
      String species,
      String habitat,
      double size,
      String colour,
      String skinType,
      Continent whichContinent,
      boolean molting,
      boolean moveSpreading) {
    super(species, habitat, size, 2, colour, skinType, whichContinent);
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
