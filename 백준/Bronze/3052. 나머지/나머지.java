import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int temp = scanner.nextInt() % 42;
            arrayList.add(i, temp);
        }
        List<Integer> newList = arrayList.stream().distinct().collect(Collectors.toList());

        System.out.println(newList.size());
    }
}