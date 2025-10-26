package racingcar;

import racingcar.controller.RacingController;
import racingcar.domain.Cars;
import racingcar.domain.Counter;
import racingcar.domain.Racing;
import racingcar.domain.RacingResult;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;
import java.util.Random;

public class Application {
    public static void main(String[] args) {

        try{
            runApplication();
        } catch (Throwable e){
            // 예외처리 메세지 출력
            System.out.println(e.getMessage());
            throw e;
        }

    }

    public static void runApplication(){

        OutputView.printInputMessageOfNameOfCars();
        List<String> nameofCars =  InputView.getNameofCars();

        OutputView.printInputMessageOfTotalCount();
        int totalCount = InputView.getCount();

        Cars cars = new Cars(nameofCars);
        Counter counter = new Counter(totalCount);
        Racing racing = new Racing(cars, counter);
        RacingController racingController = new RacingController(racing);
        racingController.run();
    }
}
