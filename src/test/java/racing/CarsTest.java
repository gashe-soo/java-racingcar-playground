package racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void 라운드별_경주_결과_출력() {
        Cars cars = new Cars("one,two,three");
        cars.move(Arrays.asList(1, 4, 5));
        List<Car> result = cars.getRoundResult();
        assertThat(result.size()).isEqualTo(3);
        assertThat(result.get(2).getNow()).isEqualTo(1);
    }

    @Test
    void 우승자_판별_기능() {
        Cars cars = new Cars("one,two,three");
        cars.move(Arrays.asList(1, 4, 5));
        List<Name> result = cars.getWinners();
        assertThat(result.size()).isEqualTo(2);
        assertThat(result).contains(new Name("two"), new Name("three"));
    }


}
