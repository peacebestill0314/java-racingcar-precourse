package racinggame.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void 자동차_생성() {
        Car car = new Car("yeon", 3);
        assertThat(car).isEqualTo(new Car("yeon", 3));
    }

}
