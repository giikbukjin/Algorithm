import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수 T

        for (int k = 0; k < T; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 3과 ABC로 분할
            int R = Integer.parseInt(st.nextToken()); // 반복 횟수 R
            String S = st.nextToken(); // 문자열 S
            String[] arr = S.split(""); // A와 B와 C로 분할

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < R; j++) {
                    sb.append(arr[i]);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}