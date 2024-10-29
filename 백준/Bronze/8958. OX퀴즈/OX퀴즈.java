import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int num = 0;
            int sum = 0;
            String[] arr = br.readLine().split("");

            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals("O")) {
                    num++;
                } else {
                    num = 0;
                }
                sum += num;
            }
            sb.append(sum + "\n");
        }
        System.out.println(sb);
    }
}