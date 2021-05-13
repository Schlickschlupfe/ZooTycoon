import animals.*;

public class Main {

  public static void main(String[] args) {

    Giraffe giraffe = new Giraffe(4.2);
    giraffe.move();

    Crocodile croc = new Crocodile(4.6);
    croc.eat();

    Horse horse = new Horse(1.60, "chestnut", "short", "lantern", "hannoveraner");
    horse.sleep();
    horse.move();

    BoaConstrictor boa = new BoaConstrictor(4.2, "black with saddle dots");
    boa.eat();

    Cow cow = new Cow(1.8, "brown spotted");
    cow.sleep();

    Axolotl axolotl = new Axolotl(0.2, "pink");
    axolotl.sleep();

    FireSalamander fireSalamander = new FireSalamander(0.15);
    fireSalamander.eat();
  }
}
