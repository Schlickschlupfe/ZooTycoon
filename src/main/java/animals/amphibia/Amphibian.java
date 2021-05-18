package animals.amphibia;

import animals.Animal;
import animals.Colouring;
import animals.Continent;
import animals.Habitat;

public abstract class Amphibian extends Animal {

  // Properties

  private boolean toxic;

  // Constructors

  public Amphibian(
      String species,
      Habitat habitat,
      double size,
      Colouring primaryColour,
      Colouring secondaryColour,
      Continent continent,
      boolean toxic) {
    super(
        species,
        habitat,
        size,
        2,
        primaryColour,
        secondaryColour,
        "smooth, slimy skin that is covered with mucus secretions",
        continent);
    this.setToxic(toxic);
  }

  // Methods

  @Override
  public abstract void move();

  @Override
  public abstract void eat();

  @Override
  public abstract void sleep();

  // Getter and Setter

  public boolean isToxic() {
    return toxic;
  }

  public void setToxic(boolean toxic) {
    this.toxic = toxic;
  }
}
