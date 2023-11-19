package programmers.basics.day5.codeTreat;

public class CodeTreat {
    public static void main(String[] args) {
        String code = "abc1abc1abc";
        Solution.solution(code);
    }
}

class Solution {
    public static String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {

            // 문자열의 i번째 구하기
            char current = code.charAt(i);

            // 문자열의 i번째가 1일 경우 mode가 변경되어야 함
            if (current == '1') {
                mode = (mode == 0) ? 1 : 0;
                continue;
            }

            // mode가 0일 경우는 짝수일 때만 문자열을 더한다
            // mode가 1일 경우는 홀수일 때만 문자열을 더한다
            if (i % 2 == mode) {
                answer.append(current);
            }

        }
        return (answer.length() == 0) ? "EMPTY" : answer.toString();
    }
}

//        String ret = "";
//        String mode = "0";
//
//        for (int i = 0; i < code.length(); i++) {
//            char s = code.charAt(i);
//
//            if (mode.equals("0")) {
//                if (s != 49 && i % 2 == 0) {
//                    ret += String.valueOf(s);
//                    continue;
//                }
//
//                if (s == 49) {
//                    mode = "1";
//                    continue;
//                }
//            }
//
//            if (mode.equals("1")) {
//                if (s != 49 && i % 2 != 0) {
//                    ret += String.valueOf(s);
//                    continue;
//                }
//
//                if (s == 49) {
//                    mode = "0";
//                    continue;
//                }
//            }
//        }
//
//        return (ret.isEmpty()) ? "EMPTY" : ret;
//    }
//}
