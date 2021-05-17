package animals.mammal;

import animals.*;

public abstract class Mammal extends Animal {

  Fur fur;
  Denture denture;

  public Mammal(
      String species,
      Habitat habitat,
      double size,
      Colouring colouring,
      Fur fur,
      Denture denture,
      Continent continent) {
    super(species, habitat, size, 2, colouring, "Fur", continent);
    this.fur = fur;
    this.denture = denture;
  }

  // Methods

  public Denture getDenture() {
    return denture;
  }

  public void setDenture(Denture denture) {
    this.denture = denture;
  }

  public Fur getFur() {
    return fur;
  }

  public void setFur(Fur fur) {
    this.fur = fur;
  }
}
