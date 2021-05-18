import animals.Colouring;
import animals.amphibia.Axolotl;
import animals.amphibia.FireSalamander;
import animals.mammal.*;
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

    Horse horse =
        new Horse(1.60, Colouring.DAPPLE_GREY, Colouring.NONE, Mane.MIDDLE, Blaze.BALD_FACE, "quarter horse");

    BoaConstrictor boa = new BoaConstrictor(4.2, Colouring.BLACK, Colouring.BROWN);
    boa.eat();
    boa.printContinent();

    Cow cow = new Cow(1.8, Colouring.WHITE, Colouring.BROWN);
    cow.sleep();
    cow.printContinent();

    Axolotl axolotl = new Axolotl(0.2, Colouring.PINK, Colouring.NONE);
    axolotl.sleep();
    axolotl.printContinent();

    FireSalamander fireSalamander = new FireSalamander(0.15);
    fireSalamander.eat();
    fireSalamander.printContinent();
  }
}
