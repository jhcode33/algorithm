package level_06.num2444;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        //== 중앙선 위쪽 ==//
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                bw.write(" ");
            }
            for (int k = 1; k <= 2 * i -1; k++) {
                bw.write("*");
            }
            bw.newLine();
        }

        //== 중앙선 아래쪽 ==//
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                bw.write(" ");
            }
            for (int k = 1; k <= 2 * i -1; k++) {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
