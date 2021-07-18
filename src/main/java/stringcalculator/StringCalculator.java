package stringcalculator;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StringCalculator {

    private static String defaultDelimeter = ",|:";

    public static int calculate(String s) {
        if(s==null || s.isEmpty())
            return 0;

        if(s.startsWith("//")){
            defaultDelimeter += "|"+s.charAt(2);
            s = s.substring(5);
        }

        return Stream.of(s.split(defaultDelimeter))
                .filter(StringCalculator::isValid)
                .mapToInt(Integer::parseInt)
                .sum();
    }
    private static boolean isValid(String str){
        if(str.chars().allMatch(Character::isDigit) || Integer.parseInt(str)>=0)
            return true;
        throw new RuntimeException();
    }
}
