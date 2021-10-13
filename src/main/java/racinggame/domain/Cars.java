package racinggame.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {

    private final List<Car> cars;

    public Cars(String names) {
        this.cars = createCars(names, () -> true);
    }

    public Cars(String names, MovingStrategy movingStrategy) {
        this.cars = createCars(names, movingStrategy);
    }

    private List<Car> createCars(String names, MovingStrategy movingStrategy) {
        String[] splitedNames = names.split(",");
        List<Car> cars = new ArrayList<>();
        for (String name : splitedNames) {
            cars.add(new Car(name, movingStrategy));
        }
        return cars;
    }

    public void move() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Car> getCars() {
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

    @Override
    public String toString() {
        return "Cars{" +
                "cars=" + cars +
                '}';
    }
}
