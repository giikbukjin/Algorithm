import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Person[] p = new Person[N]; // 5

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            // 키, 몸무게 받아서 객체 배열에 저장
            p[i] = new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                // 자기 자신 비교 제외. 몸무게와 키가 모두 큰 사람의 수 세기
                if (j != i && p[i].getWeight() < p[j].getWeight() && p[i].getHeight() < p[j].getHeight()) {
                    count++;
                }
            }
            // 키 몸무게 모두 큰 사람의 수 + 1이 등수
            p[i].setGrade(count + 1);
        }

        for (Person a : p) {
            System.out.print(a.getGrade() + " ");
        }
    }
}

class Person {
    int weight;
    int height;
    int grade;

    public Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}