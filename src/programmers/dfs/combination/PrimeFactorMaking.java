package programmers.dfs.combination;

import programmers.mathematics.PrimeFunction;

//문제 설명
//주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다.
//숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때
//소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
//
//제한사항
//nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
//nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.
//입출력 예
//nums	result
//[1,2,3,4]	1
//[1,2,7,6,4]	4
//입출력 예 설명
//입출력 예 #1
//[1,2,4]를 이용해서 7을 만들 수 있습니다.
//
//입출력 예 #2
//[1,2,4]를 이용해서 7을 만들 수 있습니다.
//[1,4,6]을 이용해서 11을 만들 수 있습니다.
//[2,4,7]을 이용해서 13을 만들 수 있습니다.
//[4,6,7]을 이용해서 17을 만들 수 있습니다.
class PrimeFactorMaking {
    public int solution(int[] nums) {
        return dfs(nums, 0, 0, 0);
    }

    private int dfs(int[] nums, int idx, int pick, int sum) {
        // 3개를 골랐을 경우, 합이 소수이면 1, 아니면 0
        if (pick == 3) {
            if (PrimeFunction.isPrime(sum)) {
                return 1;
            } else {
                return 0;
            }
        }

        // 더 고를 수 없는 경우
        if (idx == nums.length) return 0;

        int count = 0;

        // [선택분기] nums[idx]를 고르는 경우
        count += dfs(nums, idx + 1, pick + 1, sum + nums[idx]);

        // [선택분기] nums[idx]를 고르지 않는 경우
        count += dfs(nums, idx + 1, pick, sum);

        return count;
    }
}
