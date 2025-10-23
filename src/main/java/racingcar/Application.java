package racingcar;

import racingcar.controller.RacingController;
import racingcar.domain.Cars;
import racingcar.domain.Counter;
import racingcar.domain.Racing;
import racingcar.domain.RacingResult;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        
        //입력값 받은 후 인스턴스 생성
        OutputView.printInputMessageOfNameOfCars();
        List<String> nameofCars =  InputView.getNameofCars();

        OutputView.printInputMessageOfTotalCount();
        int totalCount = InputView.getCount();

        Cars cars = new Cars(nameofCars);
        Counter counter = new Counter(totalCount);


        
        
        //RacingController racingController = new RacingController();
        //racingController.run();

    }
}
