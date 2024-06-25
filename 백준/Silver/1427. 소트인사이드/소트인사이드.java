import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] numArr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) { // 자릿수로 분리해 배열에 저장
            numArr[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        for (int i = 0; i < str.length(); i++) {
            int max = i;
            for (int j = i + 1; j < str.length(); j++) {
                if (numArr[max] < numArr[j]) {
                    max = j; // 최댓값의 인덱스를 얻었다.
                }
            }
            if (numArr[i] < numArr[max]) { // swap하기
                int temp = numArr[i];
                numArr[i] = numArr[max];
                numArr[max] = temp;
            }
        }
        for (int i : numArr) {
            System.out.print(i);
        }
    }
}