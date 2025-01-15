import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numArr = new int[N];

        for (int i = 0; i < N; i++) { // 입력값을 배열에 저장
            numArr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numArr);

        for (int a : numArr) {
            System.out.println(a);
        }
    }
}