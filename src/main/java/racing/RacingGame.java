package racing;

public class RacingGame {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        String names = inputView.readNames();
        int totalRound = inputView.readRound();

        Racing racing = new Racing(new RandomNumberGenerator(), names, totalRound);

        outputView.startPrintResult();
        while(!racing.isEnd()){
            CarsDTO roundResult = racing.play();
            outputView.printResult(roundResult);

            if(racing.isEnd()){
                outputView.printWinners(roundResult);
            }
        }


    }
}
