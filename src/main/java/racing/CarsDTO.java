package racing;

import java.util.List;
import java.util.stream.Collectors;

public class CarsDTO {

    private List<CarDTO> cars;
    private List<String> winners;

    public CarsDTO(List<Car> cars, List<String> winners) {
        this.cars = cars.stream()
                .map(car-> new CarDTO(car.getName(), car.getNow()))
                .collect(Collectors.toList());
        this.winners = winners;
    }

    public List<CarDTO> getCars() {
        return cars;
    }

    public List<String> getWinners() {
        return winners;
    }

}
