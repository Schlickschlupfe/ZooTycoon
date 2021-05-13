package animals;

import continent.Continent;

public abstract class Animal {

  // Properties

  Continent whichContinent;
  private String species;
  private String habitat;
  private double size;
  private int numberOfEyes;
  private String colour;
  private String skintype;

  // Constructors

  public Animal(
      String species,
      String habitat,
      double size,
      int numberOfEyes,
      String colour,
      String skintype,
      Continent whichContinent) {
    super();
    this.setSpecies(species);
    this.setHabitat(habitat);
    this.setSize(size);
    this.setNumberOfEyes(numberOfEyes);
    this.setColour(colour);
    this.setSkintype(skintype);
  }

  // Methods

  public abstract void move();

  public abstract void eat();

  public abstract void sleep();

  // Getter and Setter

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public String getHabitat() {
    return habitat;
  }

  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }

  public double getSize() {
    return size;
  }

  public void setSize(double size) {
    this.size = size;
  }

  public int getNumberOfEyes() {
    return numberOfEyes;
  }

  public void setNumberOfEyes(int numberOfEyes) {
    this.numberOfEyes = numberOfEyes;
  }

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public String getSkintype() {
    return skintype;
  }

  public void setSkintype(String skintype) {
    this.skintype = skintype;
  }
}
