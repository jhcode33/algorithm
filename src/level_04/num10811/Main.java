package level_04.num10811;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];

        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());

            for (int k = I - 1; k < J; k++) {
                int nn = --J;
                int tmp = basket[k];
                basket[k] = basket[nn];
                basket[nn] = tmp;
            }
        }
        for (int i = 0; i < N; i++) {
            bw.write(basket[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
