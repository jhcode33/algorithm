package programmers.basics.day5.equivalentSequence;

public class EquivalentSequence {
    public static void main(String[] args) {

    }
}

class Solution {
    public static int solution(int a, int d, boolean[] included) {
        int result = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                result += a + (i * d);
            }
        }
        return result;
    }
}
