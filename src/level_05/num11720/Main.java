package level_05.num11720;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (byte value : br.readLine().getBytes()) {
            sum += (value - '0');
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}
