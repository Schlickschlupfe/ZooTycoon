package animals;

import continent.Africa;

public class Giraffe extends Ungulate {

  // Properties
  private int hooves;

  // Constructors
  public Giraffe(double size) {
    super(
        "giraffe",
        "grasland, steppe",
        size,
        "yellow-brown",
        createFur(),
        createDenture(),
        new Africa(),
        true);
    setHooves(4);
  }

  // Methods

  private static Fur createFur() {
    return new Fur(true, false, false);
  }

  private static Denture createDenture() {
    return new Denture(40, true, false, false);
  }

  @Override
  public void eat() {
    System.out.println("The giraffe is a vegetarian.");
  }

  // Getter and Setter

  public int getHooves() {
    return hooves;
  }

  public void setHooves(int hooves) {
    this.hooves = hooves;
  }

  @Override
  public void sleep() {
    // TODO Auto-generated method stub

  }
}
