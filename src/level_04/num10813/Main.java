package level_04.num10813;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] result = new int[N];


        for (int k = 0; k < N; k++) {
            result[k] = k + 1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken()) -1;
            int J = Integer.parseInt(st.nextToken()) -1;
            int tmp = result[I];
            result[I] = result[J];
            result[J] = tmp;
        }

        for (int num : result) {
            bw.write(num + " ");
        }
        bw.flush();
        bw.close();
    }
}
