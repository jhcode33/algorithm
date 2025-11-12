package programmers.mathematics;

import java.util.List;

/*문제 설명
자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
답이 항상 존재함은 증명될 수 있습니다.

제한사항
3 ≤ n ≤ 1,000,000

입출력 예
n	result
10	3       10을 3으로 나눈 나머지가 1이고, 3보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 3을 return 해야 합니다.
12	11      12를 11로 나눈 나머지가 1이고, 11보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 11을 return 해야 합니다.
*/
public class NumberOfRemainder1 {

    public int solution(int n) {
        List<Integer> divisors = DivisorFunction.getDivisors(n - 1);
        int result = Integer.MAX_VALUE;

        for (int x : divisors) {
            if (n % x == 1) {
                result = Math.min(result, x);
            }
        }

        return result;
    }
}

/* 사람들이 가장 많이 푼 풀이
   간단하게 작은 자연수부터 1씩 증가시켜서 품
*/
class Solution {
    public int solution(int n) {
        int answer = 1;

        while(true) {
            if (n % answer == 1) break;
            answer++;
        }

        return answer;
    }
}