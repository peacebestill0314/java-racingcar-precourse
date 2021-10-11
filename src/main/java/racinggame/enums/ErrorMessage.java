package racinggame.enums;

public enum ErrorMessage {

    ERROR_CAR_LENGTH("차량 이름은 5자리 이하만 가능합니다.");

    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
