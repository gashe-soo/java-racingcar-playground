package racing;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ResultView {

    public static void printResult(PlayResult playResult) {
        printProcess(playResult);
        printWinner(playResult);
    }

    private static void printWinner(PlayResult playResult) {
        System.out.println(playResult.getWinner() + "가 최종 우승했습니다.");
    }

    private static void printProcess(PlayResult playResult) {
        System.out.println("실행 결과");
        for (RoundResult roundResult : playResult.getRoundResults()) {
            for (Car car : roundResult.getRound()) {
                System.out.println(car.getName()+" : "+convert(car.getNowPosition()));
            }
            System.out.println();
        }

    }

    private static String convert(int position) {
        char[] arr = new char[position];
        for (int i = 0; i < position; i++) {
            arr[i] = '-';
        }
        return new String(arr);
    }


}
