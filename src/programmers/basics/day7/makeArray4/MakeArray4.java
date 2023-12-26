package programmers.basics.day7.makeArray4;

import java.util.ArrayList;
import java.util.List;

public class MakeArray4 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        Solution solution = new Solution();
        solution.solution(arr);
    }
}

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (list.size() == 0) {
                list.add(arr[i]);
                continue;
            }

            if (list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
                continue;
            }

            if (list.get(list.size() - 1) >= arr[i]) {
                list.remove(list.size() - 1);
                i--;
            }
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}