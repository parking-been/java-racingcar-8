package racingcar;

import racingcar.controller.RacingController;
import racingcar.domain.Cars;
import racingcar.domain.Racing;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        
        //입력값 받은 후 인스턴스 생성
        OutputView.printInputMessageOfNameOfCars();
        List<String> nameofCars =  InputView.getNameofCars();


        Cars cars = new Cars(nameofCars);

        
        
        //RacingController racingController = new RacingController();
        //racingController.run();

    }
}
