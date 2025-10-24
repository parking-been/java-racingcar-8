package racingcar.domain;

import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class Racing {
    private Cars cars;
    private Counter counter;
    private RacingResult racingResult;

    public Racing(Cars cars, Counter counter, RacingResult racingResult) {
        this.cars = cars;
        this.counter = counter;
        this.racingResult = racingResult;
    }

    public void orderCarsToMove(){
        cars.moveCars();
    }

    private void orderCarsLocation(){

    }

}
