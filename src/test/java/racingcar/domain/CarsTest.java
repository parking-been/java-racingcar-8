package racingcar.domain;

import org.junit.jupiter.api.Test;
import racingcar.exception.ErrorMessage;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarsTest {


    @Test
    void 자동차_이름_중복_예외_처리(){

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, ()->{Cars cars =new Cars(List.of("test", "test"));});
        assertThat(e.getMessage()).isEqualTo(ErrorMessage.DUPLICATED_NAME.getMessage());
    }

}