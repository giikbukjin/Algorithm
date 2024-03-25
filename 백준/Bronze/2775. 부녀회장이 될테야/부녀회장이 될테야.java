import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int K;
        int N;

        int[][] arr = new int[15][15];

        for (int i = 1; i <= 14; i++) { // 기본 값
            arr[1][i] = 1; // 모든 층의 1호는 1명
            arr[i][0] = i; // 0층의 모든 호는 (호 숫자)명
        }

        for (int i = 1; i <= 14; i++) {
            for (int j = 2; j <= 14; j++) {
                arr[j][i] = arr[j - 1][i] + arr[j][i - 1];
            }
        }

        for (int i = 0; i < num; i++) {
            K = Integer.parseInt(br.readLine()); // 층수
            N = Integer.parseInt(br.readLine()); // 호수
            sb.append(arr[N][K]).append("\n");
        }
        String str = sb.toString();
        System.out.println(str);
    }
}