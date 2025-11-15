package programmers.basics.day8.dicegame3;

import java.util.HashMap;
import java.util.Map;

public class DiceGame3 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int a, int b, int c, int d) {

        int score = 0;

        //== 동일한 주사위 수가 몇 번인지 계산하기 ==//
        int[] diceValues = {a, b, c, d};
        Map<Integer, Integer> diceCount = new HashMap<>();

        // HashMap은 중복을 허용하지 않는다. 따라서 동일한 값이 나오면 해당 key의 value가 1씩 증가하는 원리이다.
        for (int value : diceValues) {
            diceCount.put(value, diceCount.getOrDefault(value, 0) + 1);
        }

        // 모든 주사위가 동일한 값이 나올 경우
        if (diceCount.containsValue(4)) {
            int commonValue = diceCount.entrySet().stream()
                    .filter(entry -> entry.getValue() == 4)
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse(0);
            return score = 1111 * commonValue;
        }

        // 주사위 3개가 동일한 값이 나올 경우
        if (diceCount.containsValue(3)) {
            // 주사위 3개의 동일한 값 구하기
            int commonValue = diceCount.entrySet().stream()
                    .filter(entry -> entry.getValue() == 3)
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse(0);

            // 주사위 1개의 값 구하기
            int oneValue = diceCount.entrySet().stream()
                    .filter(entry -> entry.getValue() == 1)
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse(0);
            return score = (10 * commonValue + oneValue) * (10 * commonValue + oneValue);
        }

        // 주사위 2개씩 같은 값인 경우
        if (diceCount.containsValue(2) && diceCount.size() == 2) {
            int[] pairValues = diceCount.entrySet().stream()
                    .filter(entry -> entry.getValue() == 2)
                    .map(Map.Entry::getKey)
                    .mapToInt(Integer::intValue)
                    .toArray();
            return score = (pairValues[0] + pairValues[1]) * Math.abs(pairValues[0] - pairValues[1]);
        }

        // 주사위 2개는 같고 나머지 2개는 서로 다른 경우
        if (diceCount.containsValue(2) && diceCount.containsValue(1)) {
            int[] otherValues = diceCount.entrySet().stream()
                    .filter(entry -> entry.getValue() == 1)
                    .map(Map.Entry::getKey)
                    .mapToInt(Integer::intValue)
                    .toArray();
            return score = otherValues[0] * otherValues[1];
        }

        // 주사위 모두가 다른 경우
        if (diceCount.size() == 4) {
            return score = diceCount.keySet().stream()
                    .mapToInt(Integer::intValue)
                    .min()
                    .orElse(0);
        }

        return score;
    }
}