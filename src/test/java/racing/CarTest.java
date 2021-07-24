package racing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void 자동차_이름은_5자_이하로_해야한다(){
        assertThatCode(()-> new Car("hello")).doesNotThrowAnyException();
    }

    @Test
    void 자동차_이름이_5자_초과일경우_오류발생(){
        assertThatIllegalArgumentException().isThrownBy(()->new Car("newCar"))
                .withMessageContaining("이름은 5자이하이어야 합니다.");
    }

    @Test
    void 자동차_이름_공백일경우_오류발생(){
        assertThatIllegalArgumentException().isThrownBy(()-> new Car(""))
                .withMessageContaining("이름은 공백일 수 없습니다.");
        assertThatIllegalArgumentException().isThrownBy(()-> new Car(null))
                .withMessageContaining("이름은 공백일 수 없습니다.");
    }


}
