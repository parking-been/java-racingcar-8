package racingcar.domain;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RacingTest extends NsTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    Racing racing;

    @BeforeEach
    public void beforeEach(){
        Cars cars = new Cars(List.of("pobi","mini"));
        Counter counter = new Counter(3);
        RacingResult racingResult = new RacingResult();
        racing = new Racing(cars, counter, racingResult);
    }

    @AfterEach
    public void afterEach(){

    }

    @Test
    @DisplayName("남은 횟수가 경기를 진행할 수 있을 때")
    void 경기_진행여부_판단(){
        racing.orderCarsToMove();
        racing.orderCarsToMove();
        assertThat(racing.canProceedRace()).isEqualTo(true);
    }

    @Test
    @DisplayName("남은 횟수가 경기를 진행할 수 없을 때")
    void 경기_진행여부_판단_2(){
        racing.orderCarsToMove();
        racing.orderCarsToMove();
        racing.orderCarsToMove();
        assertThat(racing.canProceedRace()).isEqualTo(false);

    }

    @Test
    @DisplayName("자동차들의 현재 위치 출력")
    void 현재_자동차들의_위치_출력(){

        assertRandomNumberInRangeTest(()->{
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            racing.orderCarsToMove();
            racing.orderCarsToMove();
            racing.printCarsLocation();

            String result = out.toString().trim();

            assertThat(result).containsSubsequence("pobi : --", "mini :");

        },MOVING_FORWARD,STOP,MOVING_FORWARD,STOP);
    }

    @Test
    @DisplayName("자동차들의 현재 위치 출력_2")
    void 현재_자동차들의_위치_출력_2(){

        assertRandomNumberInRangeTest(()->{
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            racing.orderCarsToMove();
            racing.printCarsLocation();

            String result = out.toString().trim();

            assertThat(result).containsSubsequence("실행 결과","pobi : -", "mini :");

        },MOVING_FORWARD,STOP);
    }

    @Override
    protected void runMain() {

    }
}