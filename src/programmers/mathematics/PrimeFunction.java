package programmers.mathematics;

// 소인수 클래스
public class PrimeFunction {

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        double sqrt = Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

//    public static boolean isPrime(int n) {
//        // 1이하의 수는 소수가 아니다.
//        if (n <= 1) {
//            return false;
//        }
//        // 2, 3은 소수이다.
//        if (n <= 3) {
//            return true;
//        }
//        // 2나 3의 배수는 소수가 아니다.
//        if (n % 2 == 0 || n % 3 == 0) {
//            return false;
//        }
//        // √n 까지만 검사
//        // i, i+2로 증가시키며 6k ± 1 패턴만 검사
//        for (int i = 5; i * i <= n; i += 6) {
//            if (n % i == 0 || n % (i + 2) == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
}
