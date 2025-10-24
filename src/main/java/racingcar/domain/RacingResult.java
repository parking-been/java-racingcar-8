package racingcar.domain;

import racingcar.exception.ErrorMessage;

import java.util.List;
import java.util.stream.IntStream;

public class RacingResult {

    public static List<Integer> decideWinner(List<Integer> locationOfCars){
        int maxResult = locationOfCars.stream().max(Integer::compareTo).orElse(-1);
        if (maxResult==-1){
            throw new IllegalArgumentException(ErrorMessage.NO_WINNER_IN_FINAL_RESULT.getMessage());
        }
        List<Integer> winnerIndex = IntStream.range(0,locationOfCars.size())
                .filter(i->locationOfCars.get(i) == maxResult).boxed().toList();
        return winnerIndex;
    }
}
