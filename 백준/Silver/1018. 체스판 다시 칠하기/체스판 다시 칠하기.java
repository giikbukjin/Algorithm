import java.io.*;
import java.util.*;

public class Main {
    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new boolean[N][M];

        // 배열의 흰, 검 여부 판단
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                if (input.charAt(j) == 'W') {
                    arr[i][j] = true; // W일 때는 true
                } else {
                    arr[i][j] = false; // B일 떄는 false
                }
            }
        }

        int N_row = N - 7;
        int M_col = M - 7; // 경우의 수를 위한 변수

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean TF = arr[x][y]; // 첫 번째 칸의 색

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                if (arr[i][j] != TF) { // 색이 맞지 않을 경우 count 증가
                    count++;
                }
                TF = !(TF); // 색이 번갈아 나오므로 TF 반전시키기
            }
            TF = !(TF); // 줄이 바뀌면 첫 번째 색이 바뀜
        }
        // 첫 번째 칸이 흰색일 때와 검정색일 때 색칠하는 개수의 합은 64이다.
        // 따라서 둘 중 최솟값을 count로 설정한다.
        count = Math.min(count, 64 - count);

        // count가 전체 min보다 작으면 갱신한다.
        min = Math.min(min, count);
    }
}