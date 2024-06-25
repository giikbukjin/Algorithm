import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        mData[] A = new mData[N];
        int max = 0;

        for (int i = 0; i < N; i++) { // 배열에 데이터 채우기
            A[i] = new mData(Integer.parseInt(br.readLine()), i);
        }

        Arrays.sort(A); // 배열 오름차순으로 정렬

        for (int i = 0; i < N; i++) { // 원래 인덱스와 정렬 후 인덱스의 차이를 계산하여 최댓값 찾기
            if (max < A[i].index - i) {
                max = A[i].index - i;
            }
        }
        System.out.println(max + 1);
    }
}

class mData implements Comparable<mData> {
    int value;
    int index;

    public mData(int value, int index) {
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(mData o) {
        return this.value - o.value;
    }
}