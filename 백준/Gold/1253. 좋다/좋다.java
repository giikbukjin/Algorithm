import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Long[] arr = new Long[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Long.valueOf(st.nextToken());
        }
        Arrays.sort(arr);

        int count = 0;

        for (int k = 0; k < N; k++) {
            int i = 0;
            int j = N - 1;

            while (i < j) {
                if (arr[i] + arr[j] < arr[k]) {
                    i++;
                } else if (arr[i] + arr[j] > arr[k]) {
                    j--;
                } else {
                    if (i != k && j != k) {
                        count++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else {
                        j--;
                    }
                }
            }
        }
        System.out.println(count);
    }
}