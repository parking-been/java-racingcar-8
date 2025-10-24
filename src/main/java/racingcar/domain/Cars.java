package racingcar.domain;

import racingcar.exception.ErrorMessage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {
    private List<Car> carInformation;
    public Cars(List<String> nameOfCars) {
        validateDuplicateNames(nameOfCars);
        carInformation = nameOfCars.stream().map(Car::new).toList();
    }

    private void validateDuplicateNames(List<String> nameOfCars){
        Set<String> uniqueNames = new HashSet<>(nameOfCars);
        if (uniqueNames.size() != nameOfCars.size()){
            throw new IllegalArgumentException(ErrorMessage.DUPLICATED_NAME.getMessage());
        }
    }

    public void moveCars(){
        carInformation.stream().forEach(Car::move);
    }




}
