package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RacingGame {

    private List<Car> cars;
    private int times;
    private NumberGenerator numberGenerator;

    public RacingGame(NumberGenerator generator, String names, int time) {
        this.numberGenerator = generator;
        this.cars = Stream.of(names.split(","))
                .map(Car::new)
                .collect(Collectors.toList());

        if(time<=0)
            throw new IllegalArgumentException("게임은 1이상의 시도 회수가 필요합니다.");
        this.times = time;
    }

    public PlayResult play() {
        PlayResult result = new PlayResult();
        for(int i=0;i<times;i++){
            for(Car car : cars){
                int distance = numberGenerator.generate();
                car.go(distance);

            }
            result.addResult(new RoundResult(cars));
        }

        return result;
    }
}
