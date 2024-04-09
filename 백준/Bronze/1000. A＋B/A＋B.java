import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int sum = 0;
        sum += Integer.parseInt(st1.nextToken());
        sum += Integer.parseInt(st1.nextToken());

        System.out.println(sum);
    }
}