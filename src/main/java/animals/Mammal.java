package animals;

import continent.Continent;

public abstract class Mammal extends Animal {

  // Properties
  Fur fur;
  Denture denture;

  // Constructors
  public Mammal(
      String species,
      String habitat,
      double size,
      String colour,
      Fur fur,
      Denture denture,
      Continent whichContinent) {
    super(species, habitat, size, 2, colour, "Fur", whichContinent);
    this.fur = fur;
    this.denture = denture;
  }

  // Methods

}
