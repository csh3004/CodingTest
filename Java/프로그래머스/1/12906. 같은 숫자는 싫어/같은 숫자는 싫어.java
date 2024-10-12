import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(arr[0]);
        for(int i = 1; i<arr.length; i++){
            if(ar.get(ar.size()-1) != arr[i]){
                ar.add(arr[i]);
            }
        }
        
        int[] answer = new int[ar.size()];
        for(int i = 0; i<ar.size(); i++){
            answer[i] = ar.get(i);
        }
        
        return answer;
    }
}