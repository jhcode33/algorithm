package level_04.num1546;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double max = Integer.MIN_VALUE;
        double[] result = new double[N];

        double avg = 0;

        for (int i = 0; i < N; i++) {
            result[i] = Integer.parseInt(st.nextToken());
            if (result[i] > max) {
                max = result[i];
            }
        }

        for (int j = 0; j < N; j++) {
            avg += (result[j] / max ) * 100;
        }

        bw.write(String.valueOf(avg / N));
        bw.flush();
        bw.close();
    }
}
