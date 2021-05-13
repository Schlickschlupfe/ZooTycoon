package animals.amphibia;

import animals.Continent;

public class FireSalamander extends Amphibian {

  // Constructors

  public FireSalamander(double size) {
    super(
        "fire salamander",
        "moist mixed deciduous forests",
        size,
        "black and yellow",
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
