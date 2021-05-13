package animals.amphibia;

import animals.Animal;
import animals.Continent;

public abstract class Amphibian extends Animal {

  // Properties

  private boolean toxic;

  // Constructors

  public Amphibian(
      String species,
      String habitat,
      double size,
      String colour,
      Continent continent,
      boolean toxic) {
    super(
        species,
        habitat,
        size,
        2,
        colour,
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
