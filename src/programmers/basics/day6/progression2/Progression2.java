package programmers.basics.day6.progression2;

public class Progression2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2},{0, 2, 2}};
        Solution solution = new Solution();
        solution.solution(arr, queries);
    }
}

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            // 쿼리 범위에서 k보다 작은 수 구하기
            int minNumber = Integer.MAX_VALUE;
            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    if (arr[j] < minNumber) {
                        minNumber = arr[j];
                    }
                }
            }

            // 쿼리 한번 종료 -> 결과 저장
            result[i] = (minNumber == Integer.MAX_VALUE) ? -1 : minNumber;
        }

        return result;
    }
}
