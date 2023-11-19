package programmers.basics.day3.listChangeString;

public class ListChangeString {
    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c"};
        String result = "abc";

        String functionResult = Solution.solution(arr);

        if (result.equals(functionResult)) {
            System.out.println("테스트 성공!");
        }
        System.out.println(result);
        System.out.println(functionResult);
    }
}

/**
 * == Question Description ==
 * 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
 *
 * == Restrictions ==
 * 1 ≤ arr의 길이 ≤ 200
 * arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.
 *
 * == Result ==
 *      arr	        result
 * ["a","b","c"]	"abc"
 */
class Solution {
    public static String solution(String[] arr) {
        String result = "";

        for (String str : arr) {
            result += str;
        }

        return result;
    }
}
