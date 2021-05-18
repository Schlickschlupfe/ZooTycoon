package animals.amphibia;

import animals.Colouring;
import animals.Continent;
import animals.Habitat;

public class FireSalamander extends Amphibian {

  // Constructors

  public FireSalamander(double size) {
    super(
        "fire salamander",
        Habitat.FOREST,
        size,
        Colouring.YELLOW,
        Colouring.BLACK,
        Continent.EUROPE,
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
