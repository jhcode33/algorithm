package level_04.num10810;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 바구니 개수
        int M = Integer.parseInt(st.nextToken()); // 바구니에 공 넣는 방법

        int[] result = new int[N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            for (int j = first - 1; j < last; j++) {
                result[j] = count;
            }
        }
        for (int number : result) {
            bw.write(number + " ");
        }
        bw.flush();
        bw.close();
    }
}
