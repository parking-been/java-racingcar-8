package racingcar;

import racingcar.controller.RacingController;
import racingcar.domain.Racing;

public class Application {
    public static void main(String[] args) {

        Racing racing = new Racing();

        RacingController racingController = new RacingController(racing);
        racingController.run();

    }
}
