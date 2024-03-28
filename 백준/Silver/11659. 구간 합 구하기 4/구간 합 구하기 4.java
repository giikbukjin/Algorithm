import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int[] A = new int[N + 1]; // 배열
        int[] S = new int[N + 1]; // 구간 합 배열

        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st2.nextToken());
            S[i] = S[i - 1] + A[i];
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
            sb.append(-S[Integer.parseInt(st3.nextToken()) - 1] + S[Integer.parseInt(st3.nextToken())]).append("\n");
        }

        System.out.println(sb);
    }
}