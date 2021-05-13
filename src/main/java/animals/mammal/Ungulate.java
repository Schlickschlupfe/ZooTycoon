package animals.mammal;

import animals.Continent;
import animals.Denture;
import animals.Fur;

public abstract class Ungulate extends Mammal {

  // Properties

  private boolean biungulates;
  private boolean unpairedUngulates;

  // Constructors

  public Ungulate(
      String species,
      String habitat,
      double size,
      String colour,
      Fur fur,
      Denture denture,
      Continent whichContinent,
      boolean biungulates) {
    super(species, habitat, size, colour, fur, denture, whichContinent);
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
