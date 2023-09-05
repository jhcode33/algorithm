package level_02.num14681;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ternary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        String result = (x > 0 && y > 0) ? "1" :
                                (x < 0 && y > 0) ? "2" :
                                    (x < 0 && y < 0) ? "3" : "4";
        System.out.print(result);
    }
}
