package programmers.day3.stringMultiplication;

public class StringMultiplication {
    public static void main(String[] args) {
        String my_string = "string";
        int k = 3;
        String result = "stringstringstring";

        String functionResult = Solution.solution(my_string , k);

        if (result.equals(functionResult)) {
            System.out.println("테스트 성공!");
        }
        System.out.println(result);
        System.out.println(functionResult);

    }
}

/**
 * == Question Description ==
 * 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
 *
 * == Restrictions ==
 * 1 ≤ my_string의 길이 ≤ 100
 * my_string은 영소문자로만 이루어져 있습니다.
 * 1 ≤ k ≤ 100
 *
 * == Result ==
 *  my_string	k	        result
 * "string"	    3	  "stringstringstring"
 * "love"	    1 0	  "lovelovelovelovelovelovelovelovelovelove"
 */
class Solution {
    public static String solution(String my_string, int k) {
        // 1.65ms
//        String result = "";
//        for (int i = 0; i < k; i++) {
//            result += my_string;
//        }
        // 구현된 함수를 쓰는 것이 훨씬 빠르다. 0.03ms
        return my_string.repeat(k);
    }
}
