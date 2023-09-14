package level_03.num2438;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j <= i; j ++) {
                bw.write("*");
            }
                bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
