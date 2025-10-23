package racingcar.domain;

import racingcar.exception.ErrorMessage;

public class Car {
    private String name;
    private int drivingDistance;
    public Car(String name) {
        validateName(name);
        this.name = name;
        this.drivingDistance = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void validateName(String name){
        if (name.length()>5){
            throw new IllegalArgumentException(ErrorMessage.INVALID_NAME_LENGTH.getMessage());
        }
    }


}
