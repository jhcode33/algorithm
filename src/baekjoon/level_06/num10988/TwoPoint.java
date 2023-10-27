package baekjoon.level_06.num10988;

import java.io.*;

public class TwoPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int result = 1;

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            // 양 끝의 문자를 비교하면서 다르면 result에 0을 반환하고 종료
            if (str.charAt(start) != str.charAt(end)) {
                result = 0;
                break;
            }

            // 다음 비교를 위해 인덱스 이동
            start++;
            end--;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
