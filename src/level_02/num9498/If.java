package level_02.num9498;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class If {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(br.readLine());
        String result = null;

        if (score >= 90) {
            result = "A";
        } else if (score >= 80) {
            result = "B";
        } else if (score >= 70) {
            result = "C";
        } else if (score >= 60) {
            result = "D";
        } else {
            result = "F";
        }

        System.out.println(result);
    }
}
