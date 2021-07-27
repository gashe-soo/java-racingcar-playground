package racing;

public class Racing {

    private static final int ROUND_LOW = 1;
    private static final int ROUND_HI = 10;

    private final int totalRound;
    private final RandomNumberGenerator randomNumberGenerator;
    private final Cars cars;

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


}
