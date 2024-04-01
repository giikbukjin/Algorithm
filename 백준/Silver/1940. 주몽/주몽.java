import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);

        int count = 0;
        int first = 0;
        int second = N - 1;

        while (first < second) {
            if (arr.get(first) + arr.get(second) > M) {
                second--;
            } else if (arr.get(first) + arr.get(second) < M) {
                first++;
            } else {
                count++;
                first++;
                second--;
            }
        }

        System.out.println(count);
    }
}