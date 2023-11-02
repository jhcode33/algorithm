package programmers.day3.compareValue;

public class CompareValue {
    public static void main(String[] args) {
        int a = 91;
        int b = 2;
        int result = 912;

        int funResult = Solution.solution(a, b);

        if (result == funResult) {
            System.out.println("테스트 성공!");
        }
        System.out.println(result);
        System.out.println(funResult);
    }
}

/**
 * == Question Description ==
 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
 *
 * 12 ⊕ 3 = 123
 * 3 ⊕ 12 = 312
 * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
 *
 * 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
 *
 * == Restrictions ==
 * 1 ≤ a, b < 10,000
 *
 * == Result ==
 * a	b	result
 * 2	91	364
 * 91	2	912
 */
class Solution {
    public static int solution(int a, int b) {
        int A = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int B = 2 * a * b;

        return (A < B) ? B : A;
    }
}
