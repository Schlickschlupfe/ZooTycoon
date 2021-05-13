package animals.mammal;

import animals.Continent;
import animals.Denture;
import animals.Fur;

public class Cow extends Ungulate {

  // Constructors

  public Cow(double size, String colour) {
    super(
        "cow",
        "domesticated",
        size,
        colour,
        new Fur(true, false, false),
        new Denture(40, true, false, false),
        Continent.EUROPE,
        true);
  }

  // Methods

  @Override
  public void move() {
    super.move();
  }

  @Override
  public void eat() {
    System.out.println("The cow is a ruminant.");
  }

  @Override
  public void sleep() {
    System.out.println("The cow dozes standing and sleeps lying.");
  }
}
