import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> result = new ArrayList<>();
        for (String pic : picture) {
            for (int i = 0; i < k; i++) {
                StringBuilder sb = new StringBuilder();
                char[] s = pic.toCharArray();
                for (int j = 0; j < s.length; j++) {
                    for (int l = 0; l < k; l++) {
                        sb.append(s[j]);
                    }
                }
                result.add(sb.toString());
            }
        }

        return result.toArray(new String[0]);
    }
}