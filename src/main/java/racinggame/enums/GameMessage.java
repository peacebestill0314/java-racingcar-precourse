package racinggame.enums;

public enum GameMessage {

    SUCCESS_RESPONSE("성공");

    private String message;

    GameMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
