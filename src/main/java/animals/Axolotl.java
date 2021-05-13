package animals;

import continent.SouthAmerica;

public class Axolotl extends Amphibian {

  // Constructors

  public Axolotl(double size, String colour) {
    super("axolotl", "lake", size, colour, new SouthAmerica(), false);
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
