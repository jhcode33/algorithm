package programmers.day4.commonMultiple;

public class CommonMultiple {
    public static void main(String[] args) {

    }
}

class Solution {
    public static int solution(int number, int n, int m) {
        return (number % n == 0 && number % m == 0) ? 1 : 0;
    }
}
