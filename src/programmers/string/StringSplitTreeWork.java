package programmers.string;

import java.util.Arrays;

public class StringSplitTreeWork {
    public String[] solution(String myStr) {
        String[] arr = Arrays
                .stream(myStr.split("[abc]+"))
                .filter(str -> !str.isEmpty())
                .toArray(String[]::new);
        return arr.length == 0 ? new String[] { "EMPTY" } : arr;
    }
}
