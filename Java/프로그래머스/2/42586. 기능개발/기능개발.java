import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> newSpeeds = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        //실제 걸리는 시간 추가
        for(int i = 0; i<progresses.length; i++){
            if((100 - progresses[i]) % speeds[i] == 0){
                newSpeeds.add((100 - progresses[i])/speeds[i]);
            }else{
                newSpeeds.add(((100 - progresses[i])/speeds[i]) + 1);
            }
        }
        //(7,3,9)

        
        int first = newSpeeds.poll(); //7
        int cnt = 1;
        
        while(!newSpeeds.isEmpty()){
            if(first >= newSpeeds.peek()){
                newSpeeds.poll();
                cnt++;
            } else{
                list.add(cnt);
                cnt = 1;
                first = newSpeeds.poll();
            }
        }
        list.add(cnt);
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}