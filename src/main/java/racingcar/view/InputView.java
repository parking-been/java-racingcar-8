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

    public static int getCount(){
        String input = getInput();
        return inputisDigit(input);
    }

    public static String getInput(){
        try{
            String value = Console.readLine();
            return validateInput(value);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_NULL_INPUT.getMessage());
        }
    }
    public static int inputisDigit(String str){
        if(! str.matches("\\d+")){
            throw new IllegalArgumentException(ErrorMessage.INVALID_DIGIT_INPUT.getMessage());
        }
        return Integer.parseInt(str);
    }

    public static String validateInput(String str){
        if (str==null || str.trim().isBlank()){
            throw new IllegalArgumentException(ErrorMessage.INVALID_NULL_INPUT.getMessage());
        }

        return str.trim();
    }

}
