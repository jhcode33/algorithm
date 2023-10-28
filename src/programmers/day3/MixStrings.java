package programmers.day3;

import java.io.IOException;

public class MixStrings {
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        String result = "ababababab";

        String functionResult = Solution.solution(str1, str2);

        if (result.equals(functionResult)) {
            System.out.println("테스트 성공!");
        }
        System.out.println(result);
        System.out.println(functionResult);

    }
}

/**
 * == Question Description ==
 * 길이가 같은 두 문자열 str1과 str2가 주어집니다.
 * 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
 *
 * == Restrictions ==
 * 1 ≤ str1의 길이 = str2의 길이 ≤ 10
 * str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.
 *
 * == Result ==
 * str1	     str2	  result
 * "aaaaa"	"bbbbb"	  "ababababab"
 */
class Solution {
    public static String solution(String str1, String str2) {
        String result = "";

        for (int i = 0; i < str1.length(); i++) {
            result += str1.charAt(i);
            result += str2.charAt(i);
        }
        return result;
    }
}
