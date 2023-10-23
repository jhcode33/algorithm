package programmers.test;

public class Solution {
    public String solution(String s) {
        String[] words = s.split(" ");
        StringBuilder answer = new StringBuilder();

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                if (i % 2 == 0) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            }
            answer.append(" ");
        }
        return answer.toString();
    }
}
