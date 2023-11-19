package programmers.basics.day4.changeList;

public class ChangeList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};

        int[] result = Solution.solution(arr);
    }
}

class Solution {
    public static int[] solution(int[] arr) {

        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];

            if (a >= 50 && a % 2 == 0) {
                int b = a / 2;
                intArr[i] = b;
                continue;
            }

            if (a < 50 && a % 2 != 0) {
                int c = a * 2;
                intArr[i] = c;
                continue;
            }

            intArr[i] = a;
        }

        return intArr;
    }
}