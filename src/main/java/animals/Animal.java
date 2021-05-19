package animals;

public abstract class Animal {

  FeedingBehavior feedingBehavior;
  BehaviorTowardsPeople behaviorTowardsPeople;
  Continent continent;
  Habitat habitat;
  Colouring colouring;
  private String species;
  private double size;
  private int numberOfEyes;
  private String skinType;
  private int neededStability;


  public Animal(
          FeedingBehavior feedingBehavior,
          BehaviorTowardsPeople behaviorTowardsPeople,
          String species,
          Habitat habitat,
          double size,
          int numberOfEyes,
          Colouring primaryColour,
          Colouring secondaryColour,
          String skinType,
          Continent continent,
          int neededStability) {
    super();
    this.feedingBehavior = feedingBehavior;
    this.behaviorTowardsPeople = behaviorTowardsPeople;
    this.species = species;
    this.habitat = habitat;
    this.size = size;
    this.numberOfEyes = numberOfEyes;
    this.colouring = primaryColour;
    this.colouring = secondaryColour;
    this.skinType = skinType;
    this.continent = continent;
    this.neededStability = neededStability;
  }

  public void printContinent() {
    System.out.println("The " + getSpecies() + " lives in " + getContinent());
  }

  public abstract void move();

  public abstract void eat();

  public abstract void sleep();


  public FeedingBehavior getFeedingBehavior() {
    return feedingBehavior;
  }

  public BehaviorTowardsPeople getBehaviorTowardsPeople() {
    return behaviorTowardsPeople;
  }
  public void setBehaviorTowardsPeople(BehaviorTowardsPeople behaviorTowardsPeople) {
    this.behaviorTowardsPeople = behaviorTowardsPeople;
  }

  public Continent getContinent() {
    return continent;
  }
  public void setContinent(Continent continent) {
    this.continent = continent;
  }

  public String getSpecies() {
    return species;
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

  public Colouring getColouring() {
    return colouring;
  }

  public String getSkinType() {
    return skinType;
  }

  public int getNeededStability(){ return neededStability;}
}
