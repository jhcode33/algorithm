package baekjoon.level_04.num10818;

import java.io.*;
import java.util.*;

public class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE; // 최소값 초기화
        int max = Integer.MIN_VALUE; // 최대값 초기화

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num < min) {
                min = num; // 가장 작은 수가 대입됨
            }
            if (num > max) {
                max = num; // 가장 큰 수가 대입됨
            }
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}
