package animals.amphibia;

import animals.*;

public class Axolotl extends Amphibian {

  public Axolotl(
          double size,
          Colouring primaryColour,
          Colouring secondaryColor) {
    super(
            FeedingBehavior.CARNIVORE,
            BehaviorTowardsPeople.NEUTRAL,
            "axolotl",
            Habitat.LAKE,
            size,
            primaryColour,
            secondaryColor,
            Continent.SOUTH_AMERICA,
            7,
            false);
  }


  @Override
  public void move() {
    System.out.println("The axolotl is swimming.");
  }

  @Override
  public void eat() {
    System.out.println("The axolotl is an omnivore.");
  }

  @Override
  public void sleep() {
    System.out.println("The axolotl is nocturnal.");
  }
}
