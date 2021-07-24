package racing;

public class Racing {

    private static final int ROUND_LOW = 1;
    private static final int ROUND_HI = 10;

    private final int roundTime;

    public Racing(RandomNumberGenerator randomNumberGenerator, String names, int roundTime) {

        validateRound(roundTime);
        this.roundTime = roundTime;
    }

    private void validateRound(int roundTime) {
        if (roundTime < ROUND_LOW)
            throw new IllegalArgumentException("라운드는 1회 이상이어야 합니다.");
        if (roundTime > ROUND_HI)
            throw new IllegalArgumentException("라운드는 10회 이하이어야 합니다.");

    }


}
