package racing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


    public static String readName() throws IOException {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return input.readLine();
    }

    public static int readTime() throws IOException {
        System.out.println("시도할 회수는 몇 회인가요?");
        return Integer.parseInt(input.readLine());
    }

}
