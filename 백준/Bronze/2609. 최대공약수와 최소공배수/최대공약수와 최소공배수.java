import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (A < B) { // A가 B보다 크도록 정렬
            int temp = B;
            B = A;
            A = temp;
        }

        // 최대공약수
        int max = 1;
        for (int i = 1; i <= B; i++) {
            if (A % i == 0 && B % i == 0) {
                max = i;
            }
        }
        System.out.println(max);

        // 최소공배수
        if (A % B == 0) {
            System.out.println(A);
        } else {
            System.out.println((A / max) * B);
        }
    }
}