import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            if (isPrime(Integer.parseInt(st.nextToken()))) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int num) {
        int countNum = num - 1;
        if (num == 1) {
            return false;
        }
        while (countNum > 1) {
            if (num % countNum == 0) {
                return false;
            }
            countNum--;
        }
        return true;
    }
}