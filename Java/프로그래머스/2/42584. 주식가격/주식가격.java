import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i<prices.length; i++){
            int cnt = 0;
            for(int k = i + 1; k < prices.length; k++){
                cnt++;
                if(prices[i]>prices[k]){
                    break;
                }
            }
            answer[i] =cnt;
        }
        return answer;
    }
}