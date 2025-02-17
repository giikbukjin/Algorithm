import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 정수의 개수 N
        StringTokenizer sb = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) { // 정수 배열에 저장
            arr[i] = Integer.parseInt(sb.nextToken());
        }

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
//        System.out.print(Arrays.stream(arr).min().getAsInt() + " ");
//        System.out.print(Arrays.stream(arr).max().getAsInt());
    }
}