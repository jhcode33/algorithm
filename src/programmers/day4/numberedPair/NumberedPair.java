package programmers.day4.numberedPair;

public class NumberedPair {
    public static void main(String[] args) {

    }
}

class Solution {
    public static int solution(int n) {
        int result = 0;

        if (n % 2 != 0) {
            for (int i = n; i > 0; i -= 2) {
                result += i;
            }
        }

        if (n % 2 == 0) {
            for (int i = n; i > 0; i -= 2) {
                result += i * i;
            }
        }

        return result;
    }
}
