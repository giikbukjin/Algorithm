import java.io.*;
import java.util.*;

public class Solution {
    public static int complete(int N, int[] countNumArray) {
        int multiplyN = 1;
        int originN = N; // 1295

        while (true) {
            while (N > 0) {
                countNumArray[N % 10] = 1; // 1, 2, 9, 5에 해당하는 인덱스를 1로 만들기
                N /= 10;
            }
            int sum  = 0;
            for (int i = 0; i < countNumArray.length; i++) {
                sum += countNumArray[i];
            }
            if (sum == 10) { // 0~9 숫자 다 봄
                return originN * multiplyN;
            }
            multiplyN++;
            N = originN * multiplyN;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine()); // N = 1295
            int[] countNumArray = new int[10];
            sb.append("#" + i + " " + complete(N, countNumArray) + "\n");
        }
        System.out.println(sb);
    }
}