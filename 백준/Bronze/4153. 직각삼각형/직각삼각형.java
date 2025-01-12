import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int max = 0;
            int num1 = 0;
            int num2 = 0;
            if (A > B && A > C) {
                max = A;
                num1 = B;
                num2 = C;
            } else if (B > A && B > C) {
                max = B;
                num1 = A;
                num2 = C;
            } else {
                max = C;
                num1 = A;
                num2 = B;
            }

            if (A != 0) {
                if (Math.pow(num1, 2) + Math.pow(num2, 2) == Math.pow(max, 2)) {
                    sb.append("right").append("\n");
                } else {
                    sb.append("wrong").append("\n");
                }
            } else {
                break;
            }
        }
        System.out.print(sb);
    }
}