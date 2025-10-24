package racingcar.controller;

import racingcar.domain.Racing;
import racingcar.domain.RacingResult;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingController {

    private Racing racing;

    public RacingController(Racing racing) {
        this.racing = racing;
    }

    public void run(){
        //경기 진행

        //경기 마무리

    }


    /**
     * 경기 진행
     */
    private void proceedRace(){

        while(racing.canProceedRace()){
            //자동차 이동
            racing.orderCarsToMove();

            //자동차들의 위치 출력
            racing.printCarsLocation();
        }

    }

    /**
     * 경기 마침
     */
    private void finishRace(){

    }
}
