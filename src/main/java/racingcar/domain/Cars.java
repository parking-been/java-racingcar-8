package racingcar.domain;

import java.util.List;

public class Cars {
    private List<Car> carInformation;
    public Cars(List<String> nameOfCars) {
        carInformation = nameOfCars.stream().map(Car::new).toList();
    }
}
