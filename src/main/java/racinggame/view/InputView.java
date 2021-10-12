package racinggame.view;

import racinggame.enums.PlayMessage;

import java.util.Objects;

public class InputView {

    public static final int LENGTH_LIMIT = 5;
    public static final String SPLIT_REGEX = ",";

    public int getTryCount() {
        String input = ConsoleResponse.responseMessage(PlayMessage.INPUT_GET_TRY_COUNT_MESSAGE);

        try {
            validationNull(input);
            validationInt(input);
            return Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            ConsoleResponse.responseMessage(e.getMessage());
            return getTryCount();
        }
    }

    private void validationInt(String input) {
        try{
          Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(PlayMessage.ERROR_INT.message());
        }
    }

    private void validationNull(String inputResult) {
        if(validationNullCheck(inputResult)){
            throw new IllegalArgumentException(PlayMessage.ERROR_EMPTY.message());
        }
    }

    private boolean validationNullCheck(String input) {
        return Objects.isNull(input) || input.isEmpty();
    }

    public String getCarName() {
        String input = ConsoleResponse.responseMessage(PlayMessage.INPUT_GET_CAR_NAMES_MESSAGE);
        try {
            validationNull(input);
            validationLength(input);
            return input;
        } catch (IllegalArgumentException e) {
            ConsoleResponse.responseMessage(e.getMessage());
            return getCarName();
        }
    }

    private void validationLength(String input) {
        String[] splitedNames = input.split(SPLIT_REGEX);
        for (String splitedName : splitedNames) {
            validationLengthCheck(splitedName);
        }
    }

    private void validationLengthCheck(String splitedName) {
        if(splitedName.length() > LENGTH_LIMIT) {
            throw new IllegalArgumentException(PlayMessage.ERROR_CAR_LENGTH.message());
        }
    }

}
