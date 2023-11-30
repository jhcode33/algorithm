package programmers.basics.day6.twoElements;

public class TwoElements {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[num_list.length + 1];
        int lastLength = num_list.length - 1;
        int newNumber = 0;

        if (num_list[lastLength] > num_list[lastLength - 1]) {
            newNumber = num_list[lastLength] - num_list[lastLength - 1];

        } else {
            newNumber = num_list[lastLength] * 2;
        }

        for (int i = 0; i < num_list.length; i++) {
            result[i] = num_list[i];
        }
        result[result.length - 1] = newNumber;

        return result;
    }
}
