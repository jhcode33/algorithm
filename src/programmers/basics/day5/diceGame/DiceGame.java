package programmers.basics.day5.diceGame;

public class DiceGame {
    public static void main(String[] args) {

    }
}

class Solution {
    public static int solution(int a, int b, int c) {

        int answer = a + b + c;
        int result = answer;

        if (a == b || b == c || c == a) {
            result = answer * (a*a + b*b + c*c);
        }

        if (a == b && b == c) {
            result = answer * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }

        return result;
    }
}
