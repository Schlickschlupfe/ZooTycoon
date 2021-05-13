package animals;

import continent.Continent;

public abstract class Snake extends Reptile {

  // Constructors

  public Snake(
      String species,
      String habitat,
      double size,
      String colour,
      String skintype,
      Continent whichContinent) {
    super(species, habitat, size, colour, skintype, whichContinent, true, false);
  }

  // Methods

  @Override
  public void move() {
    System.out.println("The " + getSpecies() + " snakes with no legs.");
  }

  @Override
  public void eat() {
    System.out.println("The " + getSpecies() + " eats its food alive in whole.");
  }

  @Override
  public void sleep() {
    System.out.println("The " + getSpecies() + " sleeps rolled up.");
  }
}
