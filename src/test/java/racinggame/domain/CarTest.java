package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    @DisplayName("자동차를 생성한다")
    void create() {
        Car car = new Car("yeon", 3);
        assertThat(car).isEqualTo(new Car("yeon", 3));
    }

}
