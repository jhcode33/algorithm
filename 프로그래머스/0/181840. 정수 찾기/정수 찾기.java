import java.util.*;

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;

        Arrays.sort(num_list);
        int low = 0;
        int high = num_list.length -1;
        int mid;

        while(low <= high){
            mid = (low+high) / 2;

            if(num_list[mid] ==n){
                answer = 1;
                return answer;
            }

            else if(num_list[mid] > n){
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        answer = 0;
        return answer;
    }
}