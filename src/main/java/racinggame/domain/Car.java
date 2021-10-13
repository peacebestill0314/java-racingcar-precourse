package racinggame.domain;

import java.util.Objects;

public class Car {

    private final Name name;
    private final Distance distance;
    private final MovingStrategy strategy;

    public Car(String name, int distance) {
        this(name, distance, () -> true);
    }

    public Car(String name, MovingStrategy movingStrategy) {
        this(name, 0, movingStrategy);
    }

    public Car(String name, int distance, MovingStrategy strategy) {
        this.name = new Name(name);
        this.distance = new Distance(distance);
        this.strategy = strategy;
    }

    public void move() {
        if (strategy.movable()) {
            distance.move();
        }
    }

    public void move(boolean check) {
        if(check){
            distance.move();
        }
    }

    public Name name() {
        return name;
    }

    public Distance distance() {
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(distance, car.distance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distance);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name=" + name +
                ", distance=" + distance +
                ", strategy=" + strategy +
                '}';
    }

    public boolean isWinner(Distance maxDistance) {
        return distance.equals(maxDistance);
    }
}
