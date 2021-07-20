package racing;

import org.junit.jupiter.api.Test;

public class RandomNumberGeneratorStub implements NumberGenerator{

    private int number;

    public RandomNumberGeneratorStub() {
        this.number = 0;
    }

    @Override
    public int generate() {
        return ++number%4;
    }
}
