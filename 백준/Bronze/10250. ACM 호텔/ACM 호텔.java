import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken()); // 층 수
            int W = Integer.parseInt(st.nextToken()); // 방 수
            int N = Integer.parseInt(st.nextToken()); // 손님 번호

            int Nh; // 손님 층
            int Nw; // 손님 호수

            if (N % H == 0) {
                Nw = N / H;
                Nh = H;
            } else {
                Nw = N / H + 1;
                Nh = N % H;
            }
            sb.append(Nh).append(String.format("%02d", Nw)).append("\n");
        }
        System.out.print(sb);
    }
}
