package racingcar.controller;

import racingcar.domain.Racing;
import racingcar.domain.RacingResult;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {
    private Racing racing;

    public RacingController(Racing racing){
        this.racing = racing;
    }

    public void run(){
        //경기 준비
        prepareRace();

        //경기 진행

        //경기 마무리

    }

    /**
     * 경기 준비
     */
    private void prepareRace(){
        //입력 받기
        OutputView.printInputMessageOfNameOfCars();
        InputView.getNameofCars();

    }


    /**
     * 경기 진행
     */
    private void proceedRace(){

    }

    /**
     * 경기 마침
     */
    private void finishRace(){

    }
}
