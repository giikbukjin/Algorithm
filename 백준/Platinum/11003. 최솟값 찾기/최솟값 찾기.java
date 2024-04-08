import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st1.nextToken());
        int L = Integer.parseInt(st1.nextToken());

        Deque<Node> mydeque = new LinkedList<>();
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(st2.nextToken());

            while (!mydeque.isEmpty() && now < mydeque.getLast().value) {
                mydeque.removeLast();
            }

            mydeque.addLast(new Node(i, now));

            if (mydeque.getFirst().index <= i - L) {
                mydeque.removeFirst();
            }
            sb.append(mydeque.getFirst().value).append(" ");
        }
        System.out.println(sb);
    }

    static class Node {
        public int index;
        public int value;

        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}