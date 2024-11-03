import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print(fx());
    }

    static public String fx() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int num = 1;

        int first = Integer.parseInt(br.readLine());
        int prev = first;
        for (int i = 0; i < first; i++) {
            sb.append("+").append("\n");
            stack.push(num);
            num++;
        }
        stack.pop();
        sb.append("-").append("\n");

        for (int i = 1; i < n; i++) {
            int current = Integer.parseInt(br.readLine());
            if (current > prev) {
                while (num <= current) {
                    sb.append("+").append("\n");
                    stack.push(num);
                    num++;
                }
                stack.pop();
                sb.append("-").append("\n");
            } else {
                int top = stack.pop();
                sb.append("-").append("\n");
                if (top != current) {
                    return "NO";
                }
            }
            prev = current;
        }
        System.out.print(sb);
        return "";
    }
}