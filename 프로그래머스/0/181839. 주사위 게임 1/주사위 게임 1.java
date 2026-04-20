class Solution {
    public int solution(int a, int b) {
        boolean oddNumberA = a % 2 == 0 ? false : true;
        boolean oddNumberB = b % 2 == 0 ? false : true;
        int result = 0;
        if (oddNumberA && oddNumberB) {
            result = (int)Math.pow(a, 2) + (int)Math.pow(b, 2);
        } else if (oddNumberA || oddNumberB) {
            result = 2 * (a + b);
        } else {
            result = Math.abs(a - b);
        }
        return result;
    }
}