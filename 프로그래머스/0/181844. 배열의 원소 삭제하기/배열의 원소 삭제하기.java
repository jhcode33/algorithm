import java.util.*;


class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Map<Integer, Integer> deleteMap = new HashMap<>();
        for (int i = 0; i < delete_list.length; i++) {
            deleteMap.put(delete_list[i], i);
        }
        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (!deleteMap.containsKey(arr[j])) {
                result.add(arr[j]);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
        
    }
}