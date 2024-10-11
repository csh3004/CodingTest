import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        answer = nums.length/2;
        for(int i = 0; i<nums.length; i++){
            if(i == 0){
                arr.add(nums[i]);
            }else{
                if(!arr.contains(nums[i])){
                    arr.add(nums[i]);
                }
            }
        }
        int a = arr.size();
        if(answer > a){
            return a;
        }else{
        return answer;
            
        }
    }
}