package programmers.basics.day4.ifString;

import java.util.Map;
import java.util.function.BiFunction;

public class IfString {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        // Map은 문자열과 이에 대응하는 BiFunction을 정의한다
        // BiFunction은 두 개의 Integer을 받고, Boolean 값을 리턴한다
        Map<String, BiFunction<Integer, Integer, Boolean>> functions = Map.of(
                ">=", (a, b) -> a >= b,
                "<=", (a, b) -> a <= b,
                ">!", (a, b) -> a > b,
                "<!", (a, b) -> a < b
        );

        // 두 개의 문자열을 합하고, 해당 Key에 맞는 BiFunction 객체를 찾아서 apply() 메소드를 실행한다
        // 해당 결과에 따라 참이면 1을 아니면 0을 반환한다
        return functions.get(ineq + eq).apply(n, m) ? 1 : 0;
    }
}

//class Solution {
//    public static int solution(String ineq, String eq, int n, int m) {
//        String operation = ineq;
//        if (!eq.equals("!")) {
//            operation += eq;
//        }
//
//        int result = 0;
//        if (operation.equals(">=")) {
//            if (n >= m) {
//                result = 1;
//            }
//        }
//
//        if (operation.equals("<=")) {
//            if (n <= m) {
//                result = 1;
//            }
//        }
//
//        if (operation.equals(">")) {
//            if (n > m) {
//                result = 1;
//            }
//        }
//
//        if (operation.equals("<")) {
//            if (n < m) {
//                result = 1;
//            }
//        }
//        return result;
//    }
//}