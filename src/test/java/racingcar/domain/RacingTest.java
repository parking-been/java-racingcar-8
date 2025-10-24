package racingcar.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RacingTest {

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

}