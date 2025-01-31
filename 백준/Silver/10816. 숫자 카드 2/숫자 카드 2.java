import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> countHashMap = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            String key = st1.nextToken();
            countHashMap.put(key, countHashMap.getOrDefault(key, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            sb.append(countHashMap.getOrDefault(st2.nextToken(), 0)).append(" ");
        }

        System.out.print(sb);
    }
}