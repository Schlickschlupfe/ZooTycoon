package animals.reptile;

import animals.*;

public class BoaConstrictor extends Snake {
  public BoaConstrictor(
          double size,
          Colouring primaryColour,
          Colouring secondaryColour) {
    super(
            FeedingBehavior.CARNIVORE,
            BehaviorTowardsPeople.AGGRESSIVE,
            "boa constrictor",
            Habitat.RAINFOREST,
            size,primaryColour,
            secondaryColour,
            "scaly",
            Continent.SOUTH_AMERICA,
            6);
  }
}
