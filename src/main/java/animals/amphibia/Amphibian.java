package animals.amphibia;

import animals.*;

public abstract class Amphibian extends Animal {

  private boolean toxic;


  public Amphibian(
      FeedingBehavior feedingBehavior,
      BehaviorTowardsPeople behaviorTowardsPeople,
      String species,
      Habitat habitat,
      double size,
      Colouring primaryColour,
      Colouring secondaryColour,
      Continent continent,
      int neededStability,
      boolean toxic) {
    super(
            feedingBehavior,
            behaviorTowardsPeople,
            species,
            habitat,
            size,
            2,
            primaryColour,
            secondaryColour,
            "smooth, slimy skin that is covered with mucus secretions",
            continent, neededStability);
    this.setToxic(toxic);
  }


  @Override
  public abstract void move();

  @Override
  public abstract void eat();

  @Override
  public abstract void sleep();


  public boolean isToxic() {
    return toxic;
  }
  public void setToxic(boolean toxic) {
    this.toxic = toxic;
  }
}
