package animals;

import continent.Europe;

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
        new Europe(),
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
