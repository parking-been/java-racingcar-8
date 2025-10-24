package racingcar.domain;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.exception.ErrorMessage;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest extends NsTest{
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    void 생성_테스트(){
        Car car = new Car("test");
        assertThat(car.getName()).contains("test");
    }

    @Test
    @DisplayName("랜덤값이 4이상이 주어졌을때 이동하는가 확인하는 테스트")
    void 자동차_이동_명령_수행(){

        assertRandomNumberInRangeTest(()->{
            Car car = new Car("test");
            car.move();
            assertThat(car.getDrivingDistance()).isEqualTo(1);
        },MOVING_FORWARD);
    }
    @Test@DisplayName("랜덤값이 4아래로 주어졌을때 이동하는가 확인하는 테스트")
    void 자동차_이동_명령_수행2(){
        assertRandomNumberInRangeTest(()->{
            Car car = new Car("test");
            car.move();
            assertThat(car.getDrivingDistance()).isEqualTo(0);
        }, STOP);
    }

    @Test
    void 생성_예외테스트(){
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, ()-> new Car("testetst"));
        assertThat(e.getMessage()).isEqualTo(ErrorMessage.INVALID_NAME_LENGTH.getMessage());
    }


    @Override
    protected void runMain() {

    }
}