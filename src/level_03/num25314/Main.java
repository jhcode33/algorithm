package level_03.num25314;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = N / 4;
        String result = "";

        for (int i = 0; i < count; i++) {
            result += "long ";
        }
        System.out.println(result + "int");
    }
}
