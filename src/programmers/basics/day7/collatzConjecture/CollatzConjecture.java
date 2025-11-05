package programmers.basics.day7.collatzConjecture;

import java.util.ArrayList;
import java.util.List;

public class CollatzConjecture {
    public static void main(String[] args) {
        int n = 10;
        Solution solution = new Solution();
        int[] result = solution.solution(n);

        for (int t : result) {
            System.out.print(t + ", ");
        }
    }
}

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                list.add(n);
                continue;
            }

            if (n % 2 != 0) {
                n = n * 3 + 1;
                list.add(n);
            }
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
