import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int bags = 0;

        for (int i = N / 5; i >= 0 ; i--) { // 5kg 최대 배달 개수에서 시작해 하나씩 줄여 가면서
            if ((N - 5 * i) % 3 == 0) { // 3kg까지 배달했을 때 나머지가 0인 경우를 찾는다.
                bags += i;
                bags += (N - 5 * i) / 3;
                break;
            }
        }
        if (bags == 0) {
            System.out.println(-1); // 정확하게 Nkg가 아니면 -1을 반환한다.
        } else {
            System.out.println(bags);
        }
    }
}