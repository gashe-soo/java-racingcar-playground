package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {

    @Test
    void 더하기_기능_검증(){
        Position pos = new Position();
        assertThat(pos.add(1)).isEqualTo(new Position(1));
    }
}
