package animals.bird;

import animals.*;

public class Penguin  extends Bird{
    public Penguin(
            double size
            ) {
        super(
                Climate.POLAR,
                FeedingBehavior.CARNIVORE,
                BehaviorTowardsPeople.SHY,
                "penguin",
                Habitat.ICE_DESERT,
                size,
                Colouring.BLACK,
                Colouring.WHITE,
                "feathers",
                Continent.ANTARCTICA,
                4,
                Airworthy.NOT_ABLE);
    }

    @Override
    public void move() {
        System.out.println("The penguin is a excellent swimmer. On land he waddles slowly around or glides fast on his stomach.");
    }

    @Override
    public void eat() {
        System.out.println("The penguin is an absolute fish lover");
    }

    @Override
    public void sleep() {
        System.out.println("Penguins sleep standing close to each other in a large group.");
    }
}
