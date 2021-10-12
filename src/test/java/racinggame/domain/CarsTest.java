package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    @DisplayName("자동차 이름을 ','기준으로 파싱하여 자동차를 생성한다")
    void create() {
        String input = "yeon,ju,eun,bi";
        Cars cars = new Cars(input);
        assertThat(cars).isEqualTo(new Cars("yeon,ju,eun,bi"));
    }

    @Test
    @DisplayName("자동차들을 전진 시킨다")
    void move() {
        String input = "yeon,ju,eun,bi";
        Cars cars = new Cars(input, new RandomMovingStrategy());
        cars.move();
    }
}
