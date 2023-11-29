package programmers.basics.day5.ChainingNumber;

public class ChainingNumber {
    public static void main(String[] args) {

    }
}

class Solution {
    public static int solution(int[] num_list) {
        String even = "";
        String odd = "";

        for (int i : num_list) {
            if (i % 2 == 0) {
                even += String.valueOf(i);
            }

            if (i % 2 != 0) {
                odd += String.valueOf(i);
            }
        }

        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}
