package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.exception.ErrorMessage;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class InputView {
    private static final String DELIMITER = ",";

    public static List<String> getNameofCars(){
        String input = getInput();
        List<String> nameofCars = Arrays.asList(input.split(DELIMITER));
        return nameofCars;
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
