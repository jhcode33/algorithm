import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> result = new HashMap<>();
        
        for (String s : strArr) {
            result.put(s.length(), result.getOrDefault(s.length(), 0) + 1);
        }
        
        int max = 0;
        for (int c : result.values()) {
            max = Math.max(max, c);
        }
        return max;
    }
}