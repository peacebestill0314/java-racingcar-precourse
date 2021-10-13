package racinggame.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Winners {

    private final List<Car> winners;

    private Winners(List<Car> winners) {
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

    public void getNames() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("최종 우승자는 ");
        for (int index = 0; index < winners.size(); index++) {
            stringBuilder.append(winners.get(index).name().name());
            addComma(stringBuilder, index, winners.size());
        }
        stringBuilder.append(" 입니다.");
        System.out.println(stringBuilder);
    }

    private void addComma(StringBuilder builder, int index, int size) {
        if (index != size - 1) {
            builder.append(",");
        }
    }
}
