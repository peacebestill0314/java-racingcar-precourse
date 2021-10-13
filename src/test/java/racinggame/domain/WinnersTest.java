package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnersTest {

    @Test
    @DisplayName("자동차를 이동시킨 후 우승자를 체크한다")
    void create() {
        // given
        String input = "yeon,ju,eun,bi";
        Cars cars = new Cars(input);

        // when
        cars.getCars().get(0).move(true);
        cars.getCars().get(0).move(true);
        Winners winners = Winners.create(cars, new Distance(2));

        // then
        assertThat(winners).isEqualTo(new Winners(Arrays.asList(new Car("yeon", 2))));

    }
}
