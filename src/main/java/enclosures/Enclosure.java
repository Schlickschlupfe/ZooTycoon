package enclosures;


import animals.Animal;
import animals.BehaviorTowardsPeople;
import animals.FeedingBehavior;

import java.sql.SQLOutput;

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
    visitorsCanEnter();
    visitorsCanFeed();
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
