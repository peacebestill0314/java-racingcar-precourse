package racinggame.view;

import racinggame.domain.Car;
import racinggame.domain.Cars;
import racinggame.domain.Distance;
import racinggame.domain.Winners;
import racinggame.enums.PlayMessage;


public class OutputView {

    public static final String NAME_MARK = " : ";
    public static final String DISTANCE_MARK = "-";
    public static final String BLANK = "";

    public static void resultPrint(Cars cars) {
        for (Car car : cars.getCars()) {
            ConsoleResponse.responseMessage(car.name().name() + NAME_MARK + getDistanceResultMark(car.distance()));
        }
        ConsoleResponse.responseMessage(BLANK);
    }

    private static String getDistanceResultMark(Distance distance) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < distance.distance(); i++) {
            stringBuilder.append(DISTANCE_MARK);
        }
        return stringBuilder.toString();
    }

    public static void resultTitlePrint() {
        ConsoleResponse.responseMessage(BLANK);
        ConsoleResponse.responseMessage(PlayMessage.OUTPUT_RESULT.message());
    }

    public void winnerPrint(Cars cars, Distance maxDistance) {
        Winners winners = Winners.create(cars, maxDistance);
        winners.printWinners();
    }
}
