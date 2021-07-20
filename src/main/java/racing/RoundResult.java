package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RoundResult {

    private List<Car> round;

    public RoundResult(List<Car> result) {
        this.round = result;
    }

    public List<Car> getRoundWinner(){
        int maxPosition = round.stream()
                .max((c1,c2)-> Integer.compare(c1.getNowPosition(), c2.getNowPosition()))
                .get().getNowPosition();

        return round.stream()
                .filter(car-> car.getNowPosition()==maxPosition)
                .collect(Collectors.toList());
    }

}
