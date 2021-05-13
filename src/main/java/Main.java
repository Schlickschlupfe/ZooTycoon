import animals.amphibia.Axolotl;
import animals.amphibia.FireSalamander;
import animals.mammal.Cow;
import animals.mammal.Giraffe;
import animals.mammal.Horse;
import animals.reptile.BoaConstrictor;
import animals.reptile.Crocodile;

public class Main {

  public static void main(String[] args) {
    Giraffe giraffe = new Giraffe(4.2);
    giraffe.move();
    giraffe.printContinent();

    Crocodile croc = new Crocodile(4.6);
    croc.eat();
    croc.printContinent();

    Horse horse = new Horse(1.60, "chestnut", "short", "lantern", "hannoveraner");
    horse.sleep();
    horse.move();
    horse.printContinent();

    BoaConstrictor boa = new BoaConstrictor(4.2, "black with saddle dots");
    boa.eat();
    boa.printContinent();

    Cow cow = new Cow(1.8, "brown spotted");
    cow.sleep();
    cow.printContinent();

    Axolotl axolotl = new Axolotl(0.2, "pink");
    axolotl.sleep();
    axolotl.printContinent();

    FireSalamander fireSalamander = new FireSalamander(0.15);
    fireSalamander.eat();
    fireSalamander.printContinent();
  }
}
