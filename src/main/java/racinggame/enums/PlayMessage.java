package racinggame.enums;

public enum PlayMessage {

    INPUT_GET_CAR_NAMES_MESSAGE("경주할 자동차 이름을 입력하세요.(이름은(,) 기준으로 구분)"),
    INPUT_GET_TRY_COUNT_MESSAGE("시도할 횟수는 몇회인가요?"),
    OUTPUT_RESULT("실행 결과"),
    ERROR_INT("[ERROR] 숫자만 입력 가능합니다"),
    ERROR_EMPTY("[ERROR] 입력 값이 없습니다"),
    ERROR_CAR_LENGTH("[ERROR] 차량 이름은 5자리 이하만 가능합니다.");

    private String message;

    PlayMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }


}
