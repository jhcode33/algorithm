package level_04.num5597;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[30];

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num - 1] = true;
        }

        for (int j = 0; j < 30; j++) {
            if (arr[j] != true) {
                bw.write((j + 1) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
