package racinggame.view;

import racinggame.domain.Car;
import racinggame.domain.Cars;
import racinggame.domain.Distance;

public class OutputView {
    public static void resultPrint(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.println(car.name().name() + " : " + resultDistance(car.distance()));
        }
        System.out.println("");
    }

    private static String resultDistance(Distance distance) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < distance.distance(); i++) {
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }
}
