import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int queueNum = Integer.parseInt(br.readLine()); // 연산의 개수
        // o1, o2의 두 객체를 비교해 정렬 방식을 결정함
        PriorityQueue<Integer> absQueue = new PriorityQueue<>((o1, o2) -> {
            // o1과 o2의 절댓값 계산
            int num1 = Math.abs(o1);
            int num2 = Math.abs(o2);

            if (num1 == num2) { // 절댓값이 같은 경우
                return o1 > o2 ? 1 : -1; // 음수를 우선으로 정렬
            } else { // 절댓값이 다른 경우
                return num1 - num2; // 절댓값을 기준으로 정렬
            }
        });

        for (int i = 0; i < queueNum; i++) { // 수열 값 저장
            StringTokenizer st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());

            if (temp == 0) {
                if (absQueue.isEmpty()) {
                    sb.append("0\n");
                } else {
                    sb.append(absQueue.poll()).append("\n");
                }
            } else {
                absQueue.add(temp);
            }
        }
        System.out.println(sb);
    }
}