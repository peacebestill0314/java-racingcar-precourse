package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {

    @Test
    @DisplayName("이름을 생성한다")
    void create() {
        Name name = new Name("yeon");
        assertThat(name).isEqualTo(new Name("yeon"));
    }

    @Test
    @DisplayName("이름은 5자 이하만 가능하다")
    void valid_size() {
        assertThatThrownBy(() -> {
            Name name = new Name("yeonju");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
