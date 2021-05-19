package animals.reptile;

import animals.*;

public class Crocodile extends Reptile {

  // Constructors

  public Crocodile(double size) {
    super(
        FeedingBehavior.CARNIVORE,
        BehaviorTowardsPeople.AGGRESSIVE,
        "Crocodile",
        Habitat.RIVER,
        size,
        Colouring.GREEN,
        Colouring.GREY,
        "hornscale",
        Continent.AFRICA,
        5,
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
