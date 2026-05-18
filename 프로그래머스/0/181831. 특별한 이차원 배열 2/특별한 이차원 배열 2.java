class Solution {
    public int solution(int[][] arr) {
        int n1 = arr.length;
        int n2 = arr[0].length;
        
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }
        return 1;
    }
}