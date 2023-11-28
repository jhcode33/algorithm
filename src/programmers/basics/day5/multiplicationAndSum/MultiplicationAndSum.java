package programmers.basics.day5.multiplicationAndSum;

public class MultiplicationAndSum {
    public static void main(String[] args) {

    }
}

class Solution {
    public static int solution(int[] num_list) {

        int multiplication = 1;
        int sum = 0;

        for (int n : num_list) {
            multiplication *= n;
            sum += n;
        }
        return (multiplication < (sum * sum)) ? 1 : 0;
    }
}
