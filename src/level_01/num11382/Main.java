package level_01.num11382;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        System.out.println(a + b + c);


//        Scanner sc = new Scanner(System.in);
//
//        long A = sc.nextLong();
//        long B = sc.nextLong();
//        long C = sc.nextLong();
//
//        System.out.println(A + B + C);
    }
}
