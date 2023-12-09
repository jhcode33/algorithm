package programmers.basics.day7.countUp;

import java.util.ArrayList;
import java.util.List;

public class CountUp {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> list = new ArrayList<>();
        for (int i = start_num; i <= end_num; i++) {
            list.add(i);
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}