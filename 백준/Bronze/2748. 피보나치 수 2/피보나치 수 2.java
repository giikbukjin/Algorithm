import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        ArrayList<Long> arr = new ArrayList<>();
        arr.add(0, 0L);
        arr.add(1, 1L);

        for (int i = 2; i <= num; i++) {
            arr.add(i, arr.get(i - 2) + arr.get(i - 1));
        }

        System.out.println(arr.get(num));
    }
}