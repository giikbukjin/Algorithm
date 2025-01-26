import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] wordArr = new String[N];

        for (int i = 0; i < N; i++) {
            wordArr[i] = br.readLine();
        }
        // 중복 항목 제거 (배열 -> 중복 없는 Set -> 배열)
        Set<String> setArr = new HashSet<>(Arrays.asList(wordArr));
        wordArr = setArr.toArray(new String[0]);

        // 알파벳 순으로 정렬
        Arrays.sort(wordArr);

        // 길이 순으로 정렬 (버블 정렬)
        for (int i = 0; i < wordArr.length - 1; i++) {
            for (int j = 0; j < wordArr.length - 1 - i; j++) {
                if (wordArr[j].length() > wordArr[j + 1].length()) {
                    String temp = wordArr[j];
                    wordArr[j] = wordArr[j + 1];
                    wordArr[j + 1] = temp;
                }
            }
        }
        for (String a : wordArr) {
            System.out.println(a);
        }
    }
}