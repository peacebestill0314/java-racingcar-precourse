package racinggame.domain;

public class RacingGame {

    public RacingGame(int count, Cars cars) {

        for (int i = 0; i < count; i++) {
            cars.move();
        }
    }
}
