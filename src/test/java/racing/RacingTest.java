package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class RacingTest {

    @Test
    void 라운드_횟수는_1회이상_10회이하로_진행() {
        String names = "one,two,three";
        Racing racing = new Racing(new RandomNumberGenerator(), names, 10);
    }

    @Test
    void 라운드_횟수가_1미만_오류발생() {
        String names = "one,two,three";
        assertThatIllegalArgumentException().isThrownBy(() -> new Racing(new RandomNumberGenerator(), names, 0))
                .withMessageContaining("라운드는 1회 이상이어야 합니다.");
    }

    @Test
    void 라운드_횟수가_10초과_오류발생() {
        String names = "one,two,three";
        assertThatIllegalArgumentException().isThrownBy(() -> new Racing(new RandomNumberGenerator(), names, 11))
                .withMessageContaining("라운드는 10회 이하이어야 합니다.");
    }

}
