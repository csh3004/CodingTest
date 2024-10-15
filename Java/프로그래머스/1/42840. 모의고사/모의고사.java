import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> arr = new ArrayList<>();
        int index = 0;
        int[] answer_cnt = new int[3];
        int cnt = 0;
        int[][] person = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};
        
        for(int i = 0; i<person.length; i++){
            cnt = 0;
            for(int k = 0; k<answers.length; k++){
                index = k%person[i].length;
                if(answers[k] == person[i][index]){
                    cnt++;
                }
            }
            answer_cnt[i] = cnt;
        }
        
        // 5 0 0
        // 2 2 2
        int top = 0;
        for(int i = 0; i<answer_cnt.length; i++){
            if(answer_cnt[i] > top) top = answer_cnt[i];
        }
        
        for(int i = 0; i<answer_cnt.length; i++){
            if(answer_cnt[i] == top) arr.add(i+1);
        }
        
        int[] answer = new int[arr.size()];
        
        for(int i = 0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}