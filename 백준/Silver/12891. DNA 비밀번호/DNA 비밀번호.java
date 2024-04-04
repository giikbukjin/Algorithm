import java.util.*;
import java.io.*;

public class Main {
    static int[] checkArr;
    static int[] myArr;
    static int check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken()); // 문자열의 길이
        int P = Integer.parseInt(st.nextToken()); // 부분 문자열의 길이

        char[] A; // 문자열 데이터
        checkArr = new int[4]; // 비밀번호 체크 배열
        myArr = new int[4]; // 현재 상태 배열
        check = 0; // 조건을 충족한 비밀번호 개수
        int result = 0; // 결과 개수

        A = br.readLine().toCharArray(); // 문자열 데이터 입력받기

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken()); // 비밀번호 체크 배열 채우기
            if (checkArr[i] == 0) { // 필요하지 않은 문자열 있으면 바로 조건 충족
                check++;
            }
        }

        for (int i = 0; i < P; i++) { // 초기의 현재 상태 배열 구축
            Add(A[i]);
        }
        if (check == 4) {
            result++;
        }

        for (int i = P; i < S; i++) {
            Add(A[i]); // 오른쪽의 신규 수 추가
            Remove(A[i - P]);

            if (check == 4) {
                result++;
            }
        }

        System.out.println(result);
    }

    private static void Add(char c) { // 오른쪽의 신규 수
        switch (c) {
            case 'A':
                myArr[0]++;
                if (checkArr[0] == myArr[0]) {
                    check++;
                } break;
            case 'C':
                myArr[1]++;
                if (checkArr[1] == myArr[1]) {
                    check++;
                } break;
            case 'G':
                myArr[2]++;
                if (checkArr[2] == myArr[2]) {
                    check++;
                } break;
            case 'T':
                myArr[3]++;
                if (checkArr[3] == myArr[3]) {
                    check++;
                } break;
        }
    }

    private static void Remove(char c) { // 왼쪽의 빠지는 수
        switch (c) {
            case 'A':
                if (checkArr[0] == myArr[0]) {
                    check--;
                }
                myArr[0]--;
                break;
            case 'C':
                if (checkArr[1] == myArr[1]) {
                    check--;
                }
                myArr[1]--;
                break;
            case 'G':
                if (checkArr[2] == myArr[2]) {
                    check--;
                }
                myArr[2]--;
                break;
            case 'T':
                if (checkArr[3] == myArr[3]) {
                    check--;
                }
                myArr[3]--;
                break;
        }
    }
}