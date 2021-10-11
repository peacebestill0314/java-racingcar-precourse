package racinggame.domain;

import java.util.Objects;

public class Distance {
    private int distance;

    public Distance(int distance) {
        this.distance = distance;
    }

    public Distance() {
        this(0);
    }

    public void move() {
        this.distance = distance + 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distance distance1 = (Distance) o;
        return distance == distance1.distance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(distance);
    }

    @Override
    public String toString() {
        return "Distance{" +
                "distance=" + distance +
                '}';
    }
}
