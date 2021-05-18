package animals.reptile;

import animals.Colouring;
import animals.Continent;
import animals.Habitat;

public abstract class Snake extends Reptile {
  public Snake(
      String species,
      Habitat habitat,
      double size,
      Colouring primaryColour,
      Colouring secondaryColour,
      String skinType,
      Continent whichContinent) {
    super(species, habitat, size, primaryColour, secondaryColour, skinType, whichContinent, true, false);
  }

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
