import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numArray = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            numArray.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(numArray); // 오름차순 정렬
        for (int a : numArray) { // 배열 요소의 합
            sum += a;
        }

        loopOut:
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - numArray.get(i) - numArray.get(j) == 100) {
                    numArray.remove(i);
                    numArray.remove(j - 1);
                    break loopOut;
                }
            }
        }

        for (int a : numArray) { // 배열 요소의 합
            System.out.println(a);
        }
    }
}