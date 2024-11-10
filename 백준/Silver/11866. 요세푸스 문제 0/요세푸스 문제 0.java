import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> answer = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i); // 큐에 숫자 채우기
        }

        for (int i = 0; i < N; i++) { // N만큼 반복하기
            for (int j = 0; j < K - 1; j++) { // K - 1만큼 앞에서 빼서 뒤에 넣기
                queue.add(queue.poll());
            }
            answer.add(queue.poll()); // 3번째 수는 제거하기
        }

        sb.append("<");
        for (int i = 0; i < N - 1; i++) { // 결과 출력
            sb.append(answer.poll() + ", ");
        }
        sb.append(answer.poll());
        sb.append(">");
        System.out.print(sb);
    }
}