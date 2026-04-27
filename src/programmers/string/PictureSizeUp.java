package programmers.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PictureSizeUp {
    public String[] solution(String[] picture, int k) {
        List<String> result = new ArrayList<>();
        for (String row : picture) {
            // 각 문자를 k번 반복

            String w = Arrays.stream(row.split(""))
                             .map(c -> c.repeat(k))
                             .collect(Collectors.joining());

            // 행을 k번만큼 추가
            for (int i = 0; i < k; i++) {
                result.add(w);
            }
        }
        return result.toArray(new String[0]);
    }
}
