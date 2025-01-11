import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        System.out.println(result(input));
    }

    public static int result(int input) {
        int curNum = 1;

        while (curNum < input) {
            int result = 0;
            int curNumCopy = curNum;

            result += curNumCopy; // N과 N을 이루는 각 자리수의 합
            while (curNumCopy > 0) {
                result += curNumCopy % 10;
                curNumCopy /= 10;
            }
            if (result == input) {
                return curNum;
            } else {
                curNum++;
            }
        }
        return 0;
    }
}