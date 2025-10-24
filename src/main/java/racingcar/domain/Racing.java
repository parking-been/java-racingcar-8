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

    /**
     * 자동차들이 이동할 것을 명령
     */
    public void orderCarsToMove(){
        //자동차 이동
        cars.moveCars();
        //한턴 끝남
        counter.decreaseCount();
    }

    /**
     * 현재 자동차들의 위치 출력
     */
    public void printCarsLocation(){
        List<String> nameOfCars = cars.getNameOfCars();
        List<Integer> locationOfCars = cars.getDistanceOfCars();

        OutputView.printCurrentResultOfRacing(nameOfCars, locationOfCars);
    }

    /**
     * 경기를 계속 진행해야하는지 여부 판단
     */
    public boolean canProceedRace(){
        if (counter.getTotalCount()<=0){
            return false;
        }
        return true;
    }

}
