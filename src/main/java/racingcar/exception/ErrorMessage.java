package racingcar.exception;

public enum ErrorMessage {

    INVALID_NULL_INPUT("[Error] 입력이 제대로 이루어지지 않았습니다.(빈칸이거나 null값을 가집니다)"),
    INVALID_NAME_LENGTH("[Error] 자동차의 이름은 5자 이하만 가능합니다."),
    INVALID_DIGIT_INPUT("[Error] 입력값이 자연수가 아닙니다."),
    DUPLICATED_NAME("[Error] 중복된 자동차 이름이 존재합니다."),
    NO_WINNER_IN_FINAL_RESULT("[Error] 자동차 게임 우승자가 없습니다.");
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
