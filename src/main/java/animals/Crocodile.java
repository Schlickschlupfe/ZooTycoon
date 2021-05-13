package animals;

import continent.Africa;

public class Crocodile extends Reptile {

  // Constructors

  public Crocodile(double size) {
    super(
        "Crocodile",
        "lowland, humid tropics",
        size,
        "grey-green",
        "hornscale",
        new Africa(),
        false,
        false);
  }

  // Methods

  @Override
  public void move() {
    System.out.println("The crocodile is moving on four legs.");
  }

  @Override
  public void eat() {
    System.out.println("The crocodile is a carnivore.");
  }

  @Override
  public void sleep() {
    System.out.println("The crocodile is sleeping in the water.");
  }
}
