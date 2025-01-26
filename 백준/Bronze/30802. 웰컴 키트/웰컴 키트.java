import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        // 1. 티셔츠
        // 신청자 수가 T보다 작거나 같을 경우 그 개수를 세고, 클 경우 (신청자 수 / T + 1)을 하여 둘을 더한다.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] sizeArr = new int[6];
        for (int i = 0; i < 6; i++) { // 배열에 사이즈 신청자 수 널기
            sizeArr[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int count = 0;
        int T = Integer.parseInt(st2.nextToken());
        for (int a : sizeArr) {
            if (a != 0 && a <= T) {
                count++;
            } else if (a > T) {
                if (a % T == 0) {
                    count += a / T;
                } else {
                    count += a / T + 1;
                }
            }
        }
        sb.append(count).append("\n");

        // 2. 펜
        // 참가자 수(N)의 몫과 나머지를 차례대로 출력
        int P = Integer.parseInt(st2.nextToken());
        sb.append(N / P).append(" ").append(N % P);
        System.out.print(sb);
    }
}