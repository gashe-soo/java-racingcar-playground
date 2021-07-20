package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayResult {

    private List<RoundResult> roundResults;

    public PlayResult() {
        this.roundResults = new ArrayList<>();
    }

    public void addResult(RoundResult roundResult) {
        roundResults.add(roundResult);
    }

    public int getSize() {
        return roundResults.size();
    }

    public String getWinner() {
        int size = getSize();
        RoundResult lastResult = roundResults.get(size-1);
        return lastResult.getRoundWinner().stream()
                .map(Car::getName)
                .collect(Collectors.joining(","));
    }
}
