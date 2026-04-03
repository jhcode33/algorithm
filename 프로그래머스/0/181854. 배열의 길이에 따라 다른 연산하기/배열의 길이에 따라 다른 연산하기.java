class Solution {
    public int[] solution(int[] arr, int n) {
        boolean isOddNumber = arr.length % 2 != 0 ? true : false;
        for (int i = isOddNumber ? 0 : 1; i < arr.length; i+=2) {
            arr[i] = arr[i] + n;
        }
        return arr;
    }
}