package racinggame.controller;

import racinggame.domain.Cars;
import racinggame.domain.RacingGame;
import racinggame.domain.RandomMovingStrategy;
import racinggame.view.InputView;
import racinggame.view.OutputView;

public class RacingController {

    private InputView inputView;
    private OutputView outputView;

    public RacingController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void start() {
        Cars cars = new Cars(inputView.getCarName(), new RandomMovingStrategy());
        RacingGame playGame = new RacingGame(inputView.getTryCount(), cars);
        playGame.play();
    }

}
