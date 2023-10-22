package baekjoon.level_04.num2562;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] result = new int[9];
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            result[i] = num;
            if (num > max) {
                max = num;
                index = i + 1;
            }
        }

        bw.write(max + "\n" + index);
        bw.flush();
        bw.close();
    }
}
