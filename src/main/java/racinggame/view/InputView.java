package racinggame.view;

import nextstep.utils.Console;
import racinggame.enums.ErrorMessage;
import racinggame.enums.GameMessage;

import java.util.Objects;

public class InputView {

    public static final int LENGTH_LIMIT = 5;
    public static final String SPLIT_REGEX = ",";

    public int inputGetTryCount() {
        System.out.println(GameMessage.INPUT_GET_COUNT.message());
        String input = Console.readLine();
        validationCount(input);
        return Integer.parseInt(input);
    }

    private void validationCount(String input) {
        try {
            Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println(ErrorMessage.ERROR_INT.message());
            inputGetTryCount();
        }

    }

    public String inputGetName() {
        System.out.println(GameMessage.INPUT_GET_NAME.message());
        String input = Console.readLine();
        validationEmpty(input);
        validationLength(input);
        return input;
    }

    private void validationEmpty(String input) {
        try {
            validationName(input);
        } catch (Exception e) {
            System.out.println(ErrorMessage.ERROR_CAR_EMPTY.message());
            inputGetName();
        }
    }

    private void validationName(String input) {
        if(validationNull(input)){
            throw new IllegalArgumentException();
        }
    }

    private boolean validationNull(String input) {
        return Objects.isNull(input) || input.isEmpty();
    }

    private void validationLength(String input) {
        try {
            validationSize(input);
        } catch (Exception e) {
            System.out.println(ErrorMessage.ERROR_CAR_LENGTH.message());
            inputGetName();
        }
    }

    private void validationSize(String input) {
        String[] splitedNames = input.split(SPLIT_REGEX);
        for (String splitedName : splitedNames) {
            lengthCheck(splitedName);
        }
    }

    private void lengthCheck(String splitedName) {
        if(splitedName.length() > LENGTH_LIMIT) {
            throw new IllegalArgumentException();
        }
    }

}
