package racinggame.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Winners {

    public static final String COMMA = ",";
    public static final String FINAL_WINNER = "최종 우승자는 ";
    public static final String FINAL_WINNER_IS = " 입니다.";
    private final List<Car> winners;

    public Winners(List<Car> winners) {
        this.winners = winners;
    }

    public static Winners create(Cars cars, Distance maxDistance) {
        return new Winners(racingWinners(cars, maxDistance));
    }

    public static List<Car> racingWinners(Cars cars, Distance maxDistance) {
        List<Car> winners = new ArrayList<>();
        for (Car car : cars.getCars()) {
            addWinner(maxDistance, car, winners);
        }
        return winners;
    }

    private static void addWinner(Distance maxDistance, Car car, List<Car> winners) {
        if (car.isWinner(maxDistance)) {
            winners.add(car);
        }
    }

    public void printWinners() {
        StringBuilder printMessage = new StringBuilder();
        printMessage.append(FINAL_WINNER);
        for (int index = 0; index < winners.size(); index++) {
            printMessage.append(winners.get(index).name().name());
            addComma(printMessage, index, winners.size());
        }
        printMessage.append(FINAL_WINNER_IS);
        System.out.println(printMessage);
    }

    private void addComma(StringBuilder builder, int index, int size) {
        if (index != size - 1) {
            builder.append(COMMA);
        }
    }

    public List<Car> winners() {
        return winners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Winners winners1 = (Winners) o;
        return Objects.equals(winners, winners1.winners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(winners);
    }

    @Override
    public String toString() {
        return "Winners{" +
                "winners=" + winners +
                '}';
    }
}
