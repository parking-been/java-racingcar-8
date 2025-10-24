package racingcar.domain;
import camp.nextstep.edu.missionutils.Randoms;
public class RandomMovePolicy {

    private static final int RANDOM_NUMBER_LOWER_BOUND = 0;
    private static final int RANDOM_NUMBER_UPPER_BOUND = 9;

    public static int getRandomValue(){
        return Randoms.pickNumberInRange(RANDOM_NUMBER_LOWER_BOUND, RANDOM_NUMBER_UPPER_BOUND);
    }

    public static boolean move() {
        return getRandomValue()>=4;
    }
}
