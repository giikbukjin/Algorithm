import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        int[] numArr = new int[N];
        int max = 0;

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < N - 2; i++) {
            for (int j = 1; j < N - 1; j++) {
                for (int k = 2; k < N; k++) {
                    if (i != j && j != k && i != k) {
                        int sum = numArr[i] + numArr[j] + numArr[k];
                        if (sum <= M && sum > max) {
                            max = sum;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}