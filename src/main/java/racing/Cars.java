package racing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(String names) {
        this.cars = Arrays.stream(names.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }
}
