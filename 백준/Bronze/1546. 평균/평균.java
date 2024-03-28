import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double[] arr = new double[N];
        double max = 0;
        double sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(st.nextToken());

            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < N; i++) {
            arr[i] = (arr[i] / max) * 100.0;

            sum += arr[i];
        }

        System.out.println(sum / N);
    }
}