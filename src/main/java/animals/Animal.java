package animals;

public abstract class Animal {
  // Properties
  Continent continent;
  private String species;
  private String habitat;
  private double size;
  private int numberOfEyes;
  private String colour;
  private String skinType;

  // Constructors
  public Animal(
      String species,
      String habitat,
      double size,
      int numberOfEyes,
      String colour,
      String skinType,
      Continent continent) {
    super();
    this.species = species;
    this.habitat = habitat;
    this.size = size;
    this.numberOfEyes = numberOfEyes;
    this.colour = colour;
    this.skinType = skinType;
    this.continent = continent;
  }

  public void printContinent() {
    System.out.println("Animal " + getSpecies() + " lives in " + getContinent());
  }

  // Methods
  public abstract void move();

  public abstract void eat();

  public abstract void sleep();

  // Getter and Setter
  public Continent getContinent() {
    return continent;
  }

  public void setContinent(Continent continent) {
    this.continent = continent;
  }

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

  public String getSkinType() {
    return skinType;
  }

  public void setSkinType(String skinType) {
    this.skinType = skinType;
  }
}
