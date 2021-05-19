import animals.Colouring;
import animals.amphibia.Axolotl;
import animals.amphibia.FireSalamander;
import animals.mammal.*;
import animals.reptile.BoaConstrictor;
import animals.reptile.Crocodile;

public class Main {

  public static void main(String[] args) {
  Horse horse = new Horse(1.70, Colouring.BLACK, Colouring.WHITE, Mane.MIDDLE, Blaze.BALD_FACE, "quarter horse");
  horse.printContinent();
    String species = horse.getSpecies();
    System.out.println(species);

  }
}
