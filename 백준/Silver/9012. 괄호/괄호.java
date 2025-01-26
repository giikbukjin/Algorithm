import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] arr = br.readLine().split("");
            Stack<String> stack = new Stack<>();
            String isVPS = "YES";

            for (String a : arr) {
                if (a.equals("(")) {
                    stack.push(a);
                } else {
                    if (stack.isEmpty()) { // pop할 오른쪽 괄호가 없으면 false
                        isVPS = "NO";
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (!stack.isEmpty()) { // 모든 과정을 지났는데 괄호가 남아있으면 false
                isVPS = "NO";
            }
            sb.append(isVPS).append("\n");
        }
        System.out.print(sb);
    }
}