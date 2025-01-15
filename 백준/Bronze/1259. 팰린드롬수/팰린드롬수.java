import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();

        while (true) {
            String word = br.readLine();

            if (!word.equals("0")) {
                boolean isPalindrome = true;

                for (int i = 0; i < word.length() / 2; i++) { // 문자열의 절반을 스택에 넣기
                    stack.push(String.valueOf(word.charAt(i)));
                }
                // 문자열 나머지 절반과 스택의 pop()이 같은지 확인
                if (word.length() % 2 == 1) { // 길이가 홀수일 경우
                    for (int i = word.length() / 2 + 1; i < word.length(); i++) {
                        if (!stack.pop().equals(String.valueOf(word.charAt(i)))) {
                            isPalindrome = false;
                            break;
                        }
                    }
                } else { // 길이가 짝수일 경우
                    for (int i = word.length() / 2; i < word.length(); i++) {
                        if (!stack.pop().equals(String.valueOf(word.charAt(i)))) {
                            isPalindrome = false;
                            break;
                        }
                    }
                }
                if (isPalindrome) {
                    sb.append("yes").append("\n");
                } else {
                    sb.append("no").append("\n");
                }
            } else { // 0이 입력되면 종료
                break;
            }
        }
        System.out.print(sb);
    }
}