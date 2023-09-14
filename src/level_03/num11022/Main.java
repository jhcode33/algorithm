package level_03.num11022;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 1; i <= count; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String result = String.format("Case #%d: %d + %d = %d", i, a, b, (a + b));
            bw.write(result);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
