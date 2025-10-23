package racingcar.domain;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;
import racingcar.exception.ErrorMessage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void 생성_테스트(){
        Car car = new Car("test");
        assertThat(car.getName()).contains("test");
    }

    @Test
    void 생성_예외테스트(){
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, ()-> new Car("testetst"));
        assertThat(e.getMessage()).isEqualTo(ErrorMessage.INVALID_NAME_LENGTH.getMessage());
    }


}