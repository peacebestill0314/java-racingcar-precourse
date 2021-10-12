package racinggame.view;

import nextstep.utils.Console;
import racinggame.enums.PlayMessage;

public class ConsoleResponse {

    public static String responseMessage(PlayMessage playMessage) {
        System.out.println(playMessage.message());
        return Console.readLine();
    }

    public static void responseMessage(String message) {
        System.out.println(message);
    }
}
