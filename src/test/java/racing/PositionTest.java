package racing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PositionTest {

    @Test
    void 숫자만큼_전진_성공(){
        int movement = 5;

        Position position = new Position();
        position.go(movement);

        assertEquals(5, position.now());
    }


    @Test
    void 음수_숫자_전진시_에러발생(){
        int movement = -5;
        Position position = new Position();
        assertThrows(IllegalArgumentException.class, ()-> position.go(movement));
    }
}
