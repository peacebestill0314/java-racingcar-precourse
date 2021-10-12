package racinggame.domain;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy {

    public static final int LIMIT_BOUND = 10;
    public static final int CRITERION_NUMBER = 4;

    @Override
    public boolean movable() {
        int result = randomCount();
        return result >= CRITERION_NUMBER;
    }

    private int randomCount() {
        Random random = new Random();
        return random.nextInt(LIMIT_BOUND);
    }
}
