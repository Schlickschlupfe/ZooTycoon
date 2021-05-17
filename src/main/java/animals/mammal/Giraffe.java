package animals.mammal;

import animals.Colouring;
import animals.Continent;
import animals.Denture;
import animals.Habitat;

public class Giraffe extends Ungulate {

  Mane mane;

  public Giraffe(double size) {
    super(
        "giraffe",
        Habitat.STEPPE,
        size,
        Colouring.BROWN_YELLOW_SPOTTED,
        Fur.CAMOUFLAGE,
        Denture.VEGETARIAN,
        Continent.AFRICA,
        true);
    setMane(Mane.STANDING);
  }

  @Override
  public void eat() {
    System.out.println("The giraffe is a vegetarian.");
  }

  public Mane getMane() {
    return mane;
  }

  public void setMane(Mane mane) {
    this.mane = mane;
  }

  @Override
  public void sleep() {}
}
