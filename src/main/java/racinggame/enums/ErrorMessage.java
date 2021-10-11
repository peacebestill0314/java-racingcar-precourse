package racinggame.enums;

public enum ErrorMessage {

    ERROR_INT("숫자만 입력 가능합니다"),
    ERROR_CAR_EMPTY("차량 이름을 입력해야 합니다."),
    ERROR_CAR_LENGTH("차량 이름은 5자리 이하만 가능합니다.");

    private static final String ERROR = "[ERROR] ";

    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String message() {
        return ERROR + message;
    }
}
