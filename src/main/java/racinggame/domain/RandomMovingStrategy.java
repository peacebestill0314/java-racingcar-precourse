package racinggame.domain;

import nextstep.utils.Randoms;

public class RandomMovingStrategy implements MovingStrategy {

    public static final int LIMIT_MIN_NUMBER = 0;
    public static final int LIMIT_MAX_NUMBER = 9;
    public static final int CRITERION_NUMBER = 4;

    @Override
    public boolean movable() {
        return randomCount() >= CRITERION_NUMBER;
    }

    private int randomCount() {
        return Randoms.pickNumberInRange(LIMIT_MIN_NUMBER, LIMIT_MAX_NUMBER);
    }
}
