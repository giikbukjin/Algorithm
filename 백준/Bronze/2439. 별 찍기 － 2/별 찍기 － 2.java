import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) { // 0 1 2 3 4
            for (int j = i + 1; j < N; j++) { // 4 3 2 1 0
                System.out.print(" ");
            }
            for (int j = N + i + 1; j > N; j--) { // 1 2 3 4 5
                System.out.print("*");
            }
            System.out.println();
        }
    }
}