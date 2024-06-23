import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int stackNum = Integer.parseInt(br.readLine()); // 수열의 개수
        int[] array = new int[stackNum];
        Stack<Integer> stack = new Stack<>();
        int num = 1; // 1씩 증가하는 자연수
        boolean result = true;

        for (int i = 0; i < stackNum; i++) { // 수열 값 저장
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                array[i] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < stackNum; i++) {
            if (num <= array[i]) {
                while (num <= array[i]) {
                    stack.push(num);
                    num++;
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int top = stack.pop();
                if (top == array[i]) {
                    sb.append("-\n");
                } else {
                    System.out.println("NO");
                    result = false;
                    break;
                }
            }
        }
        if (result) {
            System.out.println(sb);
        }
    }
}