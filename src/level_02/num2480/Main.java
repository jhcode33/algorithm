package level_02.num2480;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int result = 0;

        // a,b,c가 동일한 경우
        if (a == b && a == c) {
            result = 10000 + a * 1000;

        // a,b or a,c가 같은 경우
        } else if (a == b && a != c || a == c && a != b) {
            result = 1000 + a * 100;

        // b,c가 같은 경우
        } else if (b == c && b != a) {
            result = 1000 + b * 100;

        } else {
            int max = a;
            if(max < b) max = b;
            if(max < c) max = c;
            result = max * 100;
        }
        System.out.print(result);
    }
}
