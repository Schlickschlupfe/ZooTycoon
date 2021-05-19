package animals.reptile;

import animals.*;

public abstract class Reptile extends Animal {
  // Properties
  private final boolean molting;
  private final boolean moveSpreading;

  // Constructors
  public Reptile(
      FeedingBehavior feedingBehavior,
      BehaviorTowardsPeople behaviorTowardsPeople,
      String species,
      Habitat habitat,
      double size,
      Colouring primaryColour,
      Colouring secondaryColour,
      String skinType,
      Continent whichContinent,
      int neededStability,
      boolean molting,
      boolean moveSpreading) {
    super(
            feedingBehavior,
            behaviorTowardsPeople,
            species,
            habitat,
            size,
            2,
            primaryColour,
            secondaryColour,
            skinType,
            whichContinent, neededStability);
    this.molting = molting;
    this.moveSpreading = moveSpreading;
  }

  public boolean isMolting() {
    return molting;
  }

  public boolean isMoveSpreading() {
    return moveSpreading;
  }
}
