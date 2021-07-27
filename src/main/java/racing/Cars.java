package racing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(String names) {
        this.cars = Arrays.stream(names.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public void move(List<Integer> randomNumbers) {
        for (int idx = 0; idx < randomNumbers.size(); idx++) {
            int number = randomNumbers.get(idx);
            Car car = cars.get(idx);
            car.move(number);
        }
    }

    public List<Car> getRoundResult() {
        return cars;
    }

    public List<Name> getWinners() {
        int winnerPosition = cars.stream()
                .max(Comparator.comparingInt(Car::getNow))
                .get()
                .getNow();

        return cars.stream()
                .filter(car -> car.getNow()==winnerPosition)
                .map(Car::getName)
                .collect(Collectors.toList());
    }
}
