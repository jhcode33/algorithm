package baekjoon.level_01.num2588;

import java.util.Scanner;

public class Calculation {
    // 나머지, 나눗셈 연산을 사용하는 방법
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // 10으로 나눌 때 나머지는 일의 자리 수이다.
        int c = (b % 10) * a;

        // 100으로 나눌 때 나머지는 십과 일의 자리 수이고,
        // 다시 10으로 나누면 십의 자리 수만 남는다.
        int d = ((b % 100) / 10) * a;  // == int d = ((b / 10) % 10) * a;

        // 100으로 나누면 백의 자리수만 남는다.
        int e = (b / 100) * a;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a*b);
    }
}
