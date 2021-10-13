package racinggame.domain;

import racinggame.enums.PlayMessage;
import racinggame.view.OutputView;

public class RacingGame {

    private final Count count;
    private final Cars cars;

    public RacingGame(Count count, Cars cars) {
        this.count = count;
        this.cars = cars;
    }

    public Cars play() {
        OutputView.resultTitlePrint();
        for (int i = 0; i < count.count(); i++) {
            cars.move();
            OutputView.resultPrint(cars);
        }
        return cars;
    }

    public Distance maxDistance() {
        Distance distance = new Distance();
        for (Car car : cars.getCars()) {
            distance = new Distance(Math.max(distance.distance(), car.distance().distance()));
        }
        return distance;
    }
}
