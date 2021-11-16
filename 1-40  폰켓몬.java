import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i<nums.length;i++){
            if(arr.size()<nums.length/2){
                if(!arr.contains(nums[i]))
                    arr.add(nums[i]);
            }
        }
        return arr.size();
    }
}
