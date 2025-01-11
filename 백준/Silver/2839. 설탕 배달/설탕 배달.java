import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int bags = 0;

        for (int i = N / 5; i >= 0 ; i--) {
            if ((N - 5 * i) % 3 == 0) {
                bags += i;
                bags += (N - 5 * i) / 3;
                break;
            }
        }
        if (bags == 0) {
            System.out.println(-1);
        } else {
            System.out.println(bags);
        }
    }
}