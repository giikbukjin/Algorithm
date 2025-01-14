import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int start = 2;
        int level = 1;

        if (number == 1) {
            System.out.println(1);
        } else {
            while (start <= number) {
                start += 6 * level;
                level++;
            }
            System.out.println(level);
        }
    }
}