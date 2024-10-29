import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next(); // 영어 단어
        int[] arr = new int[26]; // 알파벳 배열
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1; // 알파벳 배열 -1로 초기화
        }
        for (int i = 0; i < word.length(); i++) {
            if (arr[word.charAt(i) - 'a'] == -1) { // 2번 이상 등장하는 알파벳이면
                arr[word.charAt(i) - 'a'] = i;
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}