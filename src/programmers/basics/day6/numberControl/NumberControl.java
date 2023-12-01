package programmers.basics.day6.numberControl;

import java.util.Map;
import java.util.function.BiFunction;

public class NumberControl {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(0, "wsdawsdassw"));
    }
}

class Solution {
    public int solution(int n, String control) {
        Map<String, BiFunction<Integer, Integer, Integer>> functions = Map.of(
                "w", (a, b) -> a + b,
                "s", (a, b) -> a - b,
                "d", (a, b) -> a + b * 10,
                "a", (a, b) -> a - b * 10
        );

        for (int i = 0; i < control.length(); i++) {
            String s = control.substring(i, i + 1);
            n = functions.get(s).apply(n, 1);
        }

        return n;
    }
}
