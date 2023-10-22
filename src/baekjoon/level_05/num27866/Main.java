package baekjoon.level_05.num27866;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        char[] charS = S.toCharArray();

        int num = Integer.parseInt(br.readLine());

        bw.write(charS[num -1]);
        bw.flush();
        bw.close();
    }
}
