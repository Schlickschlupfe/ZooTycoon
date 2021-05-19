package animals.bird;

import animals.*;

public class Raven extends Bird{
    public Raven(double size) {
        super(
                Climate.MODERATE,
                FeedingBehavior.OMNIVORE,
                BehaviorTowardsPeople.SHY,
                "Raven",
                Habitat.VERY_ADAPTABLE,
                size,
                Colouring.BLACK,
                Colouring.NONE,
                "feather",
                Continent.EUROPE,
                6,
                Airworthy.GOOD_FLYER);
    }

    @Override
    public void move() {
        System.out.println("The raven can walk and jump and is also a very good flyer.");
    }

    @Override
    public void eat() {
        System.out.println("The raven is a an omnivore.");
    }

    @Override
    public void sleep() {
        System.out.println("The raven is sleeping on trees.");
    }
}
