import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double[] arr = new double[N];
        double M = 0.0;
        double sum = 0.0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > M) {
                M = arr[i];
            }
        }
        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] / M * 100.0;
            sum += arr[i];
        }
        System.out.println(sum / N);
    }
}