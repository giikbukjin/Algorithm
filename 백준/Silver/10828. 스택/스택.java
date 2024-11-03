import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String commend = st.nextToken();
            switch (commend) {
                case "push":
                    int X = Integer.parseInt(st.nextToken());
                    push(X);
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int X) {
        arr.add(X);
    }

    public static int pop() {
        if (arr.isEmpty()) {
            return -1;
        }
        int top = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        return top;
    }

    public static int size() {
        return arr.size();
    }

    public static int empty() {
        if (arr.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int top() {
        if (arr.isEmpty()) {
            return -1;
        }
        return arr.get(arr.size() - 1);
    }
}