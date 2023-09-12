package level_03.num2739;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        for (int i=1; i<10; i++) {
            int result = num * i;
            System.out.printf("%d * %d = %d%n", num, i, result);
        }
    }
}
