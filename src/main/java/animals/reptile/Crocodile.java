package animals.reptile;

import animals.Colouring;
import animals.Continent;
import animals.Habitat;

public class Crocodile extends Reptile {

  // Constructors

  public Crocodile(double size) {
    super(
        "Crocodile",
        Habitat.RIVER,
        size,
        Colouring.GREEN,
        Colouring.GREY,
        "hornscale",
        Continent.AFRICA,
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
