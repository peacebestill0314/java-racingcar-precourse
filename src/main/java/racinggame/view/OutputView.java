package racinggame.view;

import racinggame.domain.Car;
import racinggame.domain.Cars;
import racinggame.domain.Distance;
import racinggame.domain.Winners;


public class OutputView {

    public static final String MARK = " : ";

    public static void resultPrint(Cars cars) {
        for (Car car : cars.getCars()) {
            ConsoleResponse.responseMessage(car.name().name() + MARK + resultDistance(car.distance()));
        }
        ConsoleResponse.responseMessage("");
    }

    private static String resultDistance(Distance distance) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < distance.distance(); i++) {
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }

    public void winnerPrint(Cars cars, Distance distance) {
        Winners winners = Winners.create(cars, distance);
        winners.getNames();
    }
}
