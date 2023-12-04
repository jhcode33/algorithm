package programmers.basics.day6.progression1;

public class Progression {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        for (int[] ints : queries) {
            int n = ints[0];
            int m = ints[1];

            int temp = arr[n];
            arr[n] = arr[m];
            arr[m] = temp;
        }

        return arr;
    }
}