package racinggame.domain;

import racinggame.enums.PlayMessage;
import racinggame.view.OutputView;

public class RacingGame {

    private final Count count;
    private final Cars cars;

    public RacingGame(int count, Cars cars) {
        this(new Count(count), cars);
    }

    public RacingGame(Count count, Cars cars) {
        this.count = count;
        this.cars = cars;
    }

    public Cars play() {
        System.out.println(PlayMessage.OUTPUT_RESULT.message());
        for (int i = 0; i < count.count(); i++) {
            cars.move();
            OutputView.resultPrint(cars);
        }
        return cars;
    }
}
