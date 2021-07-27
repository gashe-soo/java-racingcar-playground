package racing;

import java.util.List;

public class Racing {

    private static final int ROUND_LOW = 1;
    private static final int ROUND_HI = 10;

    private final int totalRound;
    private final RandomNumberGenerator randomNumberGenerator;
    private final Cars cars;
    private int nowRound;

    public Racing(RandomNumberGenerator randomNumberGenerator, String names, int totalRound) {
        this.randomNumberGenerator = randomNumberGenerator;
        this.cars = new Cars(names);
        validateRound(totalRound);
        this.totalRound = totalRound;
    }

    private void validateRound(int totalRound) {
        if (totalRound < ROUND_LOW) {
            throw new IllegalArgumentException("라운드는 1회 이상이어야 합니다.");
        }
        if (totalRound > ROUND_HI) {
            throw new IllegalArgumentException("라운드는 10회 이하이어야 합니다.");
        }
    }

    public CarsDTO play() {
        nowRound++;
        int size = cars.getSize();
        cars.move(randomNumberGenerator.generate(size));
        return new CarsDTO(cars.getRoundResult(), cars.getWinners());
    }

    public boolean isEnd(){
        return nowRound == totalRound;
    }


}
