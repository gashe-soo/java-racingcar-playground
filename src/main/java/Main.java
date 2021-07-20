import racing.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var names = InputView.readName();
        var times = InputView.readTime();
        PlayResult play = new RacingGame(new RandomNumberGenerator(), names, times).play();
        ResultView.printResult(play);
    }
}
