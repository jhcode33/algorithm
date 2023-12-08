package programmers.basics.day7.makeArray;

import java.util.ArrayList;
import java.util.List;

public class MakeArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(5, 555);
    }
}

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (isCheckString(i)) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            return new int[]{-1};
        } else {
            return result.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }


    private boolean isCheckString(int num) {
        String strNum = String.valueOf(num);
        for (char c : strNum.toCharArray()) {
            if (c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }
}