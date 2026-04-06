import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> rankMap = new TreeMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                rankMap.put(rank[i], i);
            }
        }
        
        Iterator<Integer> iter = rankMap.values().iterator();

        int a = iter.next();
        int b = iter.next();
        int c = iter.next();

        return 10000 * a + 100 * b + c;
    }
}