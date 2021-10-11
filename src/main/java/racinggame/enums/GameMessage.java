package racinggame.enums;

public enum GameMessage {

    INPUT_GET_NAME("경주할 자동차 이름을 입력하세요.(이름은(,) 기준으로 구분)"),
    INPUT_GET_COUNT("시도할 횟수는 몇회인가요?"),
    OUTPUT_RESULT("실행 결과");

    private String message;

    GameMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
