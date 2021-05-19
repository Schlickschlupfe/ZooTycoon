package animals.mammal;

import animals.*;

public class Cow extends Ungulate {

  public Cow(double size, Colouring primaryColour, Colouring secondaryColour) {
    super(
        FeedingBehavior.HERBIVORE,
        BehaviorTowardsPeople.NEUTRAL,
        "cow",
        Habitat.DOMESTICATED,
        size,
        primaryColour,
        secondaryColour,
        Fur.CAMOUFLAGE,
        Denture.VEGETARIAN,
        Continent.EUROPE,
        true,
        3);
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
