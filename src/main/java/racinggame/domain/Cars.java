package racinggame.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {

    private final List<Car> cars;

    public Cars(String names) {
        this.cars = createCars(names);
    }

    private List<Car> createCars(String names) {
        String[] splitedNames = names.split(",");
        List<Car> cars = new ArrayList<>();
        for (String name : splitedNames) {
            cars.add(new Car(name));
        }
        return cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}
