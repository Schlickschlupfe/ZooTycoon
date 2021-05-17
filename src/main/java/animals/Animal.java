package animals;

public abstract class Animal {
  // Properties
  Continent continent;
  Habitat habitat;
  Colouring colouring;
  private String species;
  private double size;
  private int numberOfEyes;
  private String skinType;

  // Constructors
  public Animal(
      String species,
      Habitat habitat,
      double size,
      int numberOfEyes,
      Colouring colouring,
      String skinType,
      Continent continent) {
    super();
    this.species = species;
    this.habitat = habitat;
    this.size = size;
    this.numberOfEyes = numberOfEyes;
    this.colouring = colouring;
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

  public Habitat getHabitat() {
    return habitat;
  }

  public void setHabitat(Habitat habitat) {
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

  public Colouring getColouring() {
    return colouring;
  }

  public void setColouring(Colouring colouring) {
    this.colouring = colouring;
  }

  public String getSkinType() {
    return skinType;
  }

  public void setSkinType(String skinType) {
    this.skinType = skinType;
  }
}
