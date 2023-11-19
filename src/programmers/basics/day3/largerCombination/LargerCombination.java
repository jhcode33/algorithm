package programmers.basics.day3.largerCombination;

public class LargerCombination {
    public static void main(String[] args) {
        int a = 9;
        int b = 91;
        int result = 991;

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
 * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
 *
 * 단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
 *
 * == Restrictions ==
 * 1 ≤ a, b < 10,000
 *
 * == Result ==
 * a	b	result
 * 9	91	991
 * 89	8	898
 */
class Solution {
    public static int solution(int a, int b) {
        int A = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int B = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        int result = A;

        if (A < B) {
            result = B;
        }
        return result;
    }
}
