package racing;

import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNumberGenerator {

    private Random random;

    public RandomNumberGenerator(){
        this.random = new Random();
    }

    public int generate(){
        return random.nextInt(10);
    }

    public List<Integer> generate(int size){
        return IntStream.range(0,size)
                .mapToObj(a-> this.generate())
                .collect(Collectors.toList());
    }
}
