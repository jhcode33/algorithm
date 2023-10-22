package baekjoon.level_04.num3052;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[42];

        for(int i = 0 ; i < 10 ; i++) {
            int num = Integer.parseInt(br.readLine()) % 42;
            arr[num] = true;
        }

        int count = 0;

        for(boolean value : arr) {
            if(value) {
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
