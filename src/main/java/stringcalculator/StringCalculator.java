package stringcalculator;

import java.util.Objects;
import java.util.stream.Stream;

public class StringCalculator {
    public static int calculate(String s) {
        if(s==null || s.isEmpty())
            return 0;
        return Stream.of(s.split(",|:"))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
