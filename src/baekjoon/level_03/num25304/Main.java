package baekjoon.level_03.num25304;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        int sort = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < sort; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            sum += price * num;
        }

        System.out.print((total == sum) ? "Yes" : "No");
    }
}
