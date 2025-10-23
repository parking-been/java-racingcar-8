package racingcar.view;

public class OutputView {
    public static final String INPUT_MESSAGE_OF_NAME_OF_CARS = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String INPUT_MESSAGE_OF_TOTAL_COUNT = "시도할 횟수는 몇 회인가요?";
    public static void printInputMessageOfNameOfCars(){
        System.out.println(INPUT_MESSAGE_OF_NAME_OF_CARS);
    }
    public static void printInputMessageOfTotalCount(){
        System.out.println(INPUT_MESSAGE_OF_TOTAL_COUNT);
    }
}
