import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numCount = Integer.parseInt(br.readLine());
        int[] numArr = new int[numCount];

        for (int i = 0; i < numCount; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }
        for (int j = 0; j < numCount - 1; j++) {
            for (int i = 0; i < numCount - 1 - j; i++) {
                if (numArr[i] > numArr[i + 1]) {
                    int temp = numArr[i];
                    numArr[i] = numArr[i + 1];
                    numArr[i + 1] = temp;
                }
            }
        }
        for (int i : numArr) {
            System.out.println(i);
        }
    }
}