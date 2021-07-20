package racing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {

    @Test
    void 자동차_이름_5자_초과시_에러() {
        assertThrows(IllegalArgumentException.class, () -> new Car("fiveOver"));
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 4, 3})
    void 자동차는_특정_수만큼_전진한다(int distance) {
        Car car = new Car("test");
        car.go(distance);
        assertThat(car.getNowPosition()).isEqualTo(distance);
    }



}
