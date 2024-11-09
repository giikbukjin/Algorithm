import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int days;
        int dayDist = A - B;
        int goalDist = V - B;

        if (goalDist % dayDist == 0) {
            days = goalDist / dayDist;
        } else {
            days = goalDist / dayDist + 1;
        }
        System.out.println(days);
    }
}