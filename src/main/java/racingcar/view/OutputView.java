package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    public static final String INPUT_MESSAGE_OF_NAME_OF_CARS = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String INPUT_MESSAGE_OF_TOTAL_COUNT = "시도할 횟수는 몇 회인가요?";
    public static final String OUTPUT_MESSAGE_OF_CURRENT_RESULT_OF_RACING = "\n실행 결과";
    public static final String OUTPUT_MESSAGE_OF_FINAL_RESULT_OF_RACING = "최종 우승자 : ";

    public static void printInputMessageOfNameOfCars(){
        System.out.println(INPUT_MESSAGE_OF_NAME_OF_CARS);
    }
    public static void printInputMessageOfTotalCount(){
        System.out.println(INPUT_MESSAGE_OF_TOTAL_COUNT);
    }

    public static void printFinalResultOfRacing(List<String> result){
        System.out.print(OUTPUT_MESSAGE_OF_FINAL_RESULT_OF_RACING);
        String winners = result.stream().collect(Collectors.joining(", "));
        System.out.println(winners);
    }


    public static void printCurrentResultOfRacing(List<String> nameOfCars, List<Integer> locationOfCars, boolean isFirstCount){
        if (isFirstCount){
            System.out.println(OUTPUT_MESSAGE_OF_CURRENT_RESULT_OF_RACING);
        }
        for (int i=0; i<nameOfCars.size();i++){
            String name = nameOfCars.get(i);
            Integer distance = locationOfCars.get(i);
            System.out.println(name + " : " + "-".repeat(distance));
        }
        System.out.println();

    }
}
