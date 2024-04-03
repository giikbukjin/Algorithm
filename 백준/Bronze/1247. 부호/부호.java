import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            BigInteger S = new BigInteger("0");
            int count = Integer.parseInt(br.readLine());

            for (int j = 0; j < count; j++) {
                BigInteger num = new BigInteger(br.readLine());
                S = S.add(num);
            }

            if (S.compareTo(BigInteger.ZERO) < 0) {
                sb.append("-\n");
            } else if (S.compareTo(BigInteger.ZERO) > 0) {
                sb.append("+\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.print(sb);
    }
}