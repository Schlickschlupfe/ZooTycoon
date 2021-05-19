package animals.amphibia;

import animals.*;

public class FireSalamander extends Amphibian {

  // Constructors

  public FireSalamander(double size) {
    super(
        FeedingBehavior.CARNIVORE,
        BehaviorTowardsPeople.SHY,
        "fire salamander",
        Habitat.FOREST,
        size,
        Colouring.YELLOW,
        Colouring.BLACK,
        Continent.EUROPE,
        6,
        true);
  }

  // Methods

  @Override
  public void move() {
    System.out.println("The fire salamander is moving on four legs");
  }

  @Override
  public void eat() {
    System.out.println("The fire salamander is eating mostly insects");
  }

  @Override
  public void sleep() {
    System.out.println("The fire salamander is nocturnal");
  }
}
