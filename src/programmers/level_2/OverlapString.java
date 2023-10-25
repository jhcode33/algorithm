package programmers.level_2;

public class OverlapString {
    public static void main(String[] args) {
        String test1 = "He11oWor1d";
        String test2 = "lloWorl";
        int test3 = 2;
        String result = "HelloWorld";

        String myResult =  Solution.solution(test1, test2, test3);

        if (result.equals(myResult)) {
            System.out.printf("입력값 > %s, %s, %s \n", test1, test2, test3);
            System.out.printf("기대값 > %s \n", result);
            System.out.printf("실행 결과 > 테스트를 통과하였습니다.");
        } else {
            System.out.print("테스트 실패");
        }


    }
}

class Solution {
    public static String solution(String my_string, String overwrite_string, int s) {
        String result = my_string.substring(0, s) + overwrite_string;

        if (my_string.length() > result.length()) {
            result += my_string.substring(result.length());
        }

        return result;
    }
}
