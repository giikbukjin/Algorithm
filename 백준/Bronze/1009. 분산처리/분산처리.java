import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int T = scanner.nextInt();
        int result = 1;

        for (int i = 0; i < T; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a % 10 == 0) {
                stringBuilder.append(10 + "\n");
                continue;
            }
            int num = a % 10;
            for (int j = 1; j < b; j++) {
                num = (num * a) % 10;
            }
            stringBuilder.append(num).append("\n");
        }
        System.out.println(stringBuilder);
    }
}