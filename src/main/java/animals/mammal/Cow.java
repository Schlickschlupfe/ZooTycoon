package animals.mammal;

import animals.Colouring;
import animals.Continent;
import animals.Denture;
import animals.Habitat;

public class Cow extends Ungulate {

  public Cow(double size, Colouring colouring) {
    super(
        "cow",
        Habitat.DOMESTICATED,
        size,
        colouring,
        Fur.CAMOUFLAGE,
        Denture.VEGETARIAN,
        Continent.EUROPE,
        true);
  }

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
