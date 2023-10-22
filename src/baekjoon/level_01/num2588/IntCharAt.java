package baekjoon.level_01.num2588;

import java.util.Scanner;

public class IntCharAt {
    // 문자열로 입력 받아 charAt()으로 분리하는 방법
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();

        System.out.println(a * (b.charAt(2)) - '0');
        System.out.println(a * (b.charAt(1)) - '0');
        System.out.println(a * (b.charAt(0)) - '0');
        System.out.println(a * Integer.parseInt(b));
    }
}
