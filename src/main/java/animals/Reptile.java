package animals;

import continent.Continent;

public abstract class Reptile extends Animal {

  // Properties

  private boolean molting;
  private boolean moveSpreading;

  // Constructors
  public Reptile(
      String species,
      String habitat,
      double size,
      String colour,
      String skintype,
      Continent whichContinent,
      boolean molting,
      boolean moveSpreading) {
    super(species, habitat, size, 2, colour, skintype, whichContinent);
    this.setMolting(molting);
    this.setMoveSpreading(moveSpreading);
  }

  // Methods

  // Setter and Getter

  public boolean isMolting() {
    return molting;
  }

  public void setMolting(boolean molting) {
    this.molting = molting;
  }

  public boolean isMoveSpreading() {
    return moveSpreading;
  }

  public void setMoveSpreading(boolean moveSpreading) {
    this.moveSpreading = moveSpreading;
  }
}
