import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> result = new ArrayList<>();
        for (String row : picture) {
            // 각 문자를 k번 반복한 문자열
            String expanded = Arrays.stream(row.split(""))
                                    .map(c -> c.repeat(k))
                                    .collect(Collectors.joining());
            // 해당 행을 k번 추가
            for (int i = 0; i < k; i++) result.add(expanded);
        }
        return result.toArray(new String[0]);
    }
}