package baekjoon.level_04.num10871;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int[] list = new int[size];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < size; j++) {
            if (list[j] < num) {
                bw.write(list[j] + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}
