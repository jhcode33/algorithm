package level_02.num1330;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class If {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a > b){
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else if (a == b) {
            System.out.println("==");
        }
    }
}
