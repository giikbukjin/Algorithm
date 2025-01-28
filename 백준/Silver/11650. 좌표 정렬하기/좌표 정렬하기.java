import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Coordinate[] corArr = new Coordinate[N];

        for (int i = 0; i < N; i++) { // 객체 배열에 저장
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            corArr[i] = new Coordinate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(corArr, new Comparator<Coordinate>() {
            @Override
            public int compare(Coordinate o1, Coordinate o2) {
                int result = Integer.compare(o1.getX(), o2.getX());
                if (result == 0) {
                    return compareTo(o1, o2);
                }
                return result;
            }

            public int compareTo(Coordinate o1, Coordinate o2) {
                return Integer.compare(o1.getY(), o2.getY());
            }
        });

        for (Coordinate c : corArr) {
            System.out.println(c.getX() + " " + c.getY());
        }
    }
}

class Coordinate {
    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}