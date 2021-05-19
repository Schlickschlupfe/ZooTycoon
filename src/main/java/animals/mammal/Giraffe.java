package animals.mammal;

import animals.*;

public class Giraffe extends Ungulate {

  Mane mane;

  public Giraffe(double size) {
    super(
        FeedingBehavior.HERBIVORE,
        BehaviorTowardsPeople.SHY,
        "giraffe",
        Habitat.STEPPE,
        size,
        Colouring.YELLOW,
        Colouring.BROWN,
        Fur.CAMOUFLAGE,
        Denture.VEGETARIAN,
        Continent.AFRICA,
        true,
        3);
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
