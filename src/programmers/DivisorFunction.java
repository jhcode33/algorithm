import java.util.List;
import java.util.ArrayList;

public class DivisorFunction {

    public static List<Integer> getDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                addDivisors(divisors, i, n / i);
            }
        }

        return divisors;
    }

    public static int getDivisorCount(int n) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                addDivisors(divisors, i, n / i);
            }
        }

        return divisors.size();
    }

    public static int getDivisorSum(int n) {
        List<Integer> divisors = getDivisors(n);

        int sum = 0;
        for (int divisor : divisors) {
            sum += divisor;
        }

        return sum;
    }

    private static void addDivisors(List<Integer> divisors, int small, int large) {
        divisors.add(small);
        if (small != large) {
            divisors.add(large);
        }
    }
}