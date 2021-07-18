package stringcalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {


    @Test
    void 빈_문자열_null_입력시_0반환() {
        assertThat(StringCalculator.calculate("")).isEqualTo(0);
        assertThat(StringCalculator.calculate(null)).isEqualTo(0);
    }

    @Test
    void 숫자_하나입력시_해당_숫자_반환(){
        assertThat(StringCalculator.calculate("1")).isEqualTo(1);
        assertThat(StringCalculator.calculate("10")).isEqualTo(10);
    }

    @Test
    void 숫자_두개_컴마_구분자_숫자의_합_반환(){
        assertThat(StringCalculator.calculate("1,2")).isEqualTo(3);
        assertThat(StringCalculator.calculate("10,2")).isEqualTo(12);
    }

    @Test
    void 구분자_콜론도_사용(){
        assertThat(StringCalculator.calculate("1,2:3")).isEqualTo(6);
    }

    @Test
    void 기본구분자외_커스텀_구분자_지정(){
        assertThat(StringCalculator.calculate("//;\\n1;2;3")).isEqualTo(6);
    }

    @Test
    void 기본구분자와_커스텀_구분자_지정_같이_사용(){
        assertThat(StringCalculator.calculate("//;\\n1,2;3")).isEqualTo(6);
    }

    @Test
    void 숫자이외_값_음수_전달시_예외(){
        assertThrows(RuntimeException.class, ()->StringCalculator.calculate("hello"));
        assertThrows(RuntimeException.class, ()->StringCalculator.calculate("-1"));
        assertThrows(RuntimeException.class, ()->StringCalculator.calculate("\\hello"));
        assertThrows(RuntimeException.class, ()->StringCalculator.calculate("1,-2:3"));
    }


}
