import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++) { // 해시 테이블에 전체 숫자 목록 넣기
            String token = st1.nextToken();
            hashMap.put(token, Integer.parseInt(token));
        }

        for (int i = 0; i < M; i++) {
            int isExist = 0;
            String token = st2.nextToken();

            if (hashMap.get(token) != null) {
                isExist = 1;
            }
            sb.append(isExist).append("\n");
        }
        System.out.print(sb);
    }
}