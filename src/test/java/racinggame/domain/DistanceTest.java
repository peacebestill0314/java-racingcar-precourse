package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DistanceTest {

    @Test
    @DisplayName("위치를 생성한다")
    void create() {
        Distance distance = new Distance(3);
        assertThat(distance).isEqualTo(new Distance(3));
    }

    @Test
    @DisplayName("위치는 전진 또는 멈춤으로 결정된다")
    void Valid() {
        Distance distance = new Distance();
        distance.move();
        assertThat(distance).isEqualTo(new Distance(1));
    }
}
