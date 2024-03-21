import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int F = scanner.nextInt();

        int num = (N / 100) * 100; // ex) N = 275라면 200으로 변환

        for (int i = 0; i < 99; i++) { // 브루트포스 알고리즘
            if ((num + i) % F == 0) {
                System.out.println(String.format("%02d", i)); // 한 자리 숫자 앞에 0 붙이기
                break;
            }
        }
    }
}