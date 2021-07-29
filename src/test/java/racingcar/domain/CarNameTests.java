package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.exception.InvalidCarNameException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTests {
    @Test
    @DisplayName("Car 원시값 포장 객체 create test")
    void create() {
        CarName carName = new CarName("pobi");
        assertThat(carName.value()).isEqualTo("pobi");
    }

    @Test
    @DisplayName("차 이름이 5글자 초과일 때 test")
    void valid() {
        assertThatThrownBy(() -> {
            new Car(new CarName("test123"));
        }).isInstanceOf(InvalidCarNameException.class);
    }
}