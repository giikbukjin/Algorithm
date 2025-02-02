import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 이항계수 : N! / ((N - K)! * K!)
        System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
    }

    public static int factorial(int num) {
        while (num > 1) {
            return num * factorial(num - 1);
        }
        return 1;
    }
}