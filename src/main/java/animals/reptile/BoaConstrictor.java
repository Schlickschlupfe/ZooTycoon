package animals.reptile;

import animals.Colouring;
import animals.Continent;
import animals.Habitat;

public class BoaConstrictor extends Snake {
  public BoaConstrictor(double size, Colouring primaryColour, Colouring secondaryColour) {
    super("boa constrictor", Habitat.RAINFOREST, size,primaryColour, secondaryColour, "scaly", Continent.SOUTH_AMERICA);
  }
}
