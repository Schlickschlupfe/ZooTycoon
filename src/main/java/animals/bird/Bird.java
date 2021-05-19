package animals.bird;

import animals.*;

public abstract class Bird extends Animal {

    Airworthy airworthy;


    public Bird(
            FeedingBehavior feedingBehavior,
            BehaviorTowardsPeople behaviorTowardsPeople,
            String species,
            Habitat habitat,
            double size,
            Colouring primaryColour,
            Colouring secondaryColour,
            String skinType,
            Continent continent,
            int neededStability,
            Airworthy airworthy) {
        super(
                feedingBehavior,
                behaviorTowardsPeople,
                species,
                habitat,
                size,
                2,
                primaryColour,
                secondaryColour,
                skinType,
                continent, neededStability);
        this.airworthy = airworthy;
    }

}
