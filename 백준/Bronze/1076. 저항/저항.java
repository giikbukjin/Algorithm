import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String color1 = br.readLine();
        String color2 = br.readLine();
        String color3 = br.readLine();
        long result = 0L;

        ArrayList<String> arrayList = new ArrayList<>(
                Arrays.asList("black", "brown", "red", "orange", "yellow", "green",
                        "blue", "violet", "grey", "white")
        );

        result += arrayList.indexOf(color1) * 10;
        result += arrayList.indexOf(color2);
        result *= Math.pow(10, arrayList.indexOf(color3));

        System.out.println(result);
    }
}