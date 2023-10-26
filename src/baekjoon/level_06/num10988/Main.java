package baekjoon.level_06.num10988;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String palindrome = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            palindrome += str.charAt(i);
        }

        if (str.equals(palindrome)) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
    }
}
