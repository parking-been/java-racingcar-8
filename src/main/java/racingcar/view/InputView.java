package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.exception.ErrorMessage;

import java.util.NoSuchElementException;

public class InputView {
    public static void getNameofCars(){
        String input = getInput();

    }

    public static void getCount(){

    }

    public static String getInput(){
        try{
            String value = Console.readLine();
            return validateInput(value);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_NULL_INPUT.getMessage());
        }
    }

    public static String validateInput(String str){
        if (str==null || str.trim().isBlank()){
            throw new IllegalArgumentException(ErrorMessage.INVALID_NULL_INPUT.getMessage());
        }

        return str.trim();
    }

}
