package enclosures;


import animals.*;

public class Enclosure {

  Animal animal;
  Fence fence;
  Ground ground;
  Climate climate;
  private boolean fenceIsHolding;
  private boolean visitorsCanEnter;
  private boolean visitorsCanFeed;

  public Enclosure(
          Animal animal,
          Fence fence,
          Ground ground,
          Climate climate,
          boolean visitorsCanEnter,
          boolean visitorsCanFeed) {
    this.animal = animal;
    this.fence = fence;
    this.ground = ground;
    this.climate = climate;
    this.visitorsCanEnter = visitorsCanEnter;
    this.visitorsCanFeed = visitorsCanFeed;
    fenceHolding();
    visitorsCanEnter();
    visitorsCanFeed();
    whichGround();
    climateSuitable();
  }

  public void fenceHolding(){
    if(fence.getStability() < animal.getNeededStability()){
      fenceIsHolding = true;
      System.out.println("The " + animal.getSpecies() + " escaped.");
    } else {
      fenceIsHolding = false;
      System.out.println("The " + animal.getSpecies() + " is safe in its enclosure.");
    }
  }

  private void visitorsCanEnter(){
    if(animal.getBehaviorTowardsPeople() == BehaviorTowardsPeople.TRUSTING && animal.getNeededStability() <= 5){
      visitorsCanEnter = true;
      System.out.println("Visitors can enter the enclosure.");
    } else {
      visitorsCanEnter = false;
    }
  }

  private void visitorsCanFeed(){
    if(animal.getFeedingBehavior() == FeedingBehavior.HERBIVORE && animal.getBehaviorTowardsPeople() != BehaviorTowardsPeople.AGGRESSIVE && animal.getNeededStability() <= 5){
      visitorsCanFeed = true;
      System.out.println("Visitors can feed");
    } else {
      visitorsCanFeed = false;
    }
  }

  private void whichGround(){
    if(animal.getHabitat() == Habitat.GRASSLAND){
      System.out.println("The enhance is covered with " + Ground.GRASS + Ground.FRESH_WATER);
    } else if(animal.getHabitat() == Habitat.DESERT){
      System.out.println("The enhance is covered with " + Ground.SAND);
    }else if(animal.getHabitat() == Habitat.FOREST){
      System.out.println("The enhance is covered with " + Ground.FOREST_GROUND + Ground.EARTH);
    }else if(animal.getHabitat() == Habitat.LAKE || animal.getHabitat() == Habitat.RIVER){
      System.out.println("The enhance is covered with " + Ground.GRASS + Ground.EARTH + Ground.FRESH_WATER);
    }else if(animal.getHabitat() == Habitat.DOMESTICATED){
      System.out.println("The enhance is covered with " + Ground.GRASS + Ground.EARTH);
    }else if(animal.getHabitat() == Habitat.ICE_DESERT){
      System.out.println("The enhance is covered with " + Ground.SNOW + Ground.SALTWATER + Ground.STONE);
    }else if(animal.getHabitat() == Habitat.MOUNTAINS){
      System.out.println("The enhance is covered with " + Ground.STONE + Ground.EARTH + Ground.FOREST_GROUND);
    }else if(animal.getHabitat() == Habitat.OCEAN){
      System.out.println("The enhance is covered with " + Ground.SALTWATER);
    }else if(animal.getHabitat() == Habitat.RAINFOREST){
      System.out.println("The enhance is covered with " + Ground.TROPICAL_GROUND + Ground.FRESH_WATER);
    }else if(animal.getHabitat() == Habitat.STEPPE){
      System.out.println("The enhance is covered with " + Ground.SAND + Ground.GRASS + Ground.EARTH);
    }else if(animal.getHabitat() == Habitat.SWAMP){
      System.out.println("The enhance is covered with " + Ground.FRESH_WATER + Ground.EARTH);
    }else if(animal.getHabitat() == Habitat.TAIGA){
      System.out.println("The enhance is covered with " + Ground.FOREST_GROUND + Ground.EARTH + Ground.FRESH_WATER);
    }else if(animal.getHabitat() == Habitat.TUNDRA){
      System.out.println("The enhance is covered with " + Ground.GRASS + Ground.STONE);
    }else {
      System.out.println("The enhance is covered with the given ground.");
    }
  }

  private void climateSuitable() {
    if (climate == animal.getClimate()){
      System.out.println("Everything is fine.");
    }else if(climate.getHeat() < animal.getClimate().getHeat()){
      System.out.println("A heating is needed.");
    }else{
      System.out.println("A air conditioner is needed.");
    }
  }

  public Fence getFence() {
    return fence;
  }
  public void setFence(Fence fence) {
    this.fence = fence;
  }

  public Ground getGround() {
    return ground;
  }
  public void setGround(Ground ground) {
    this.ground = ground;
  }

  public Climate getClimate() {
      return climate;
  }
  public void setClimate(Climate climate) {
      this.climate = climate;
  }

}
