import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int sum = 0;
        int num = 1;
        int index = 1;
        int[] arr = new int[1000];

        for (int i = 0; i < 1000; i++) { // 배열에 숫자 채우기
            arr[i] = num;
            if (num == index) {
                num++;
                index = 0;
            }
            index++;
        }

        for (int i = A; i <= B; i++) {
            sum += arr[i - 1];
        }
        
        System.out.println(sum);
    }
}