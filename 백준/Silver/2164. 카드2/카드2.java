import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cardCount = Integer.parseInt(br.readLine());
        Queue<Integer> cardQueue = new LinkedList<>();

        for (int i = 1; i <= cardCount; i++) {
            cardQueue.add(i); // 1부터 N까지 카드 채우기
        }

        while (cardQueue.size() > 1) { // 카드 1장 남을 때까지 반
            cardQueue.poll();
            cardQueue.add(cardQueue.poll());
        }

        System.out.println(cardQueue.poll());
    }
}