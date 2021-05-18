package animals.amphibia;

import animals.Colouring;
import animals.Continent;
import animals.Habitat;

public class Axolotl extends Amphibian {

  // Constructors

  public Axolotl(double size, Colouring primaryColour, Colouring secondaryColor) {
    super("axolotl", Habitat.LAKE, size, primaryColour, secondaryColor, Continent.SOUTH_AMERICA, false);
  }

  // Methods

  @Override
  public void move() {
    System.out.println("The axolotl is swimming.");
  }

  @Override
  public void eat() {
    System.out.println("The axolotl is an omnivore.");
  }

  @Override
  public void sleep() {
    System.out.println("The axolotl is nocturnal.");
  }
}
