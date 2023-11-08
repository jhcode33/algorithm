package programmers.day4.flagReturn;

public class FlagReturn {
    public static void main(String[] args) {

    }
}

class Solution {
    public static int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}
