import java.io.*;
import java.util.*;

public class Main {
    static Queue<Integer> queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();
    static Integer recentPush = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String command = br.readLine();

            switch (command) {
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
                default:
                    // push
                    StringTokenizer st = new StringTokenizer(command, " ");
                    st.nextToken();

                    int push = Integer.parseInt(st.nextToken());
                    push(push);
                    recentPush = push;
                    break;
            }
        }
        System.out.print(sb);
    }

    public static void push(int X) {
        queue.add(X);
    }

    public static void pop() {
        Integer poll = queue.poll();

        if (poll == null) {
            sb.append(-1).append("\n");
        } else {
            sb.append(poll).append("\n");
        }
    }

    public static void size() {
        sb.append(queue.size()).append("\n");
    }

    public static void empty() {
        if (queue.isEmpty()) {
            sb.append(1).append("\n");
        } else {
            sb.append(0).append("\n");
        }
    }

    public static void front() {
        Integer peek = queue.peek();

        if (peek == null) {
            sb.append(-1).append("\n");
        } else {
            sb.append(peek).append("\n");
        }
    }

    public static void back() {
        if (queue.peek() == null) {
            sb.append(-1).append("\n");
        } else {
            sb.append(recentPush).append("\n");
        }
    }
}