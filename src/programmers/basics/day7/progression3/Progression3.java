package programmers.basics.day7.progression3;

public class Progression3 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for (int j = s; j <= e; j++) {
                if (j % k == 0) {
                    arr[j] = arr[j] + 1;
                }
            }
        }

        return arr;
    }
}