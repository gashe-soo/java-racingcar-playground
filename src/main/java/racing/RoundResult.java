package racing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RoundResult {

    private List<Car> round;

    public RoundResult(List<Car> result) {
        this.round = result;
    }

    public List<Car> getRound() {
        return round;
    }

    public List<Car> getRoundWinner(){
        int maxPosition = round.stream()
                .max(Comparator.comparingInt(Car::getNowPosition))
                .get().getNowPosition();

        return round.stream()
                .filter(car-> car.getNowPosition()==maxPosition)
                .collect(Collectors.toList());
    }

}
