package racing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RacingGameTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, 0})
    void 게임은_자연수_회수이상으로_실행(int time) {
        String names = "one,two,three,four";
        assertThrows(IllegalArgumentException.class,
                () -> new RacingGame(new RandomNumberGeneratorStub(), names, time));
    }

    @Test
    void 출력_테스트와_우승_테스트(){
        String names = "one,two,three";
        int time = 3;
        // 1,2,3을 순서대로 생성하는 숫자생성기
        RacingGame racingGame = new RacingGame(new RandomNumberGeneratorStub(), names, time);

        PlayResult playResult = racingGame.play();

        assertEquals(time, playResult.getSize());
        assertEquals("three", playResult.getWinner());
    }

}
