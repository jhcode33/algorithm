package baekjoon.level_05.num9086;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String str = br.readLine();
            bw.write(String.valueOf(str.charAt(0)) +
                         String.valueOf(str.charAt(str.length()-1)) +"\n");
        }
        bw.flush();
        bw.close();
    }
}
