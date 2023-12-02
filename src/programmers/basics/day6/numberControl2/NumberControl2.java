package programmers.basics.day6.numberControl2;

public class NumberControl2 {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(int[] numLog) {
        String result = "";

        for (int i = 0; i < numLog.length - 1; i++) {

            switch (numLog[i + 1] - numLog[i]) {
                case 1:
                    result += "w";
                    break;
                case -1:
                    result += "s";
                    break;
                case 10:
                    result += "d";
                    break;
                case -10:
                    result += "a";
                    break;
            }
        }

        return result;
    }
}
