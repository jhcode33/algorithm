package baekjoon.level_05.num11654;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문자열을 아스키 코드 값으로 변환
        int ch = br.readLine().charAt(0);

        bw.write(Integer.toString(ch));
        bw.flush();
        bw.close();
    }
}
