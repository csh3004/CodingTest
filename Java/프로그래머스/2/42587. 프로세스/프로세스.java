import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int top = 0;
        int target = priorities[location];
        int nowlocation = location;
        int cnt = 0;
        

        
        //큐 삽입
        for(int p : priorities){
            q.add(p);
        }
        
        for(int i : q){
            if(i >= top) {
                top = i;
            }
        }
        
        
        while(!q.isEmpty()){
            if(q.peek() != top){ //최대 순위가 아닐경우 넘기기
                q.add(q.poll());
                if(nowlocation == 0){
                    nowlocation = q.size() -1;
                }else{
                    nowlocation--;
                }
            }else{ //최대 순위일 경우
                q.poll();
                cnt++;
                top = 0;
                for(int i : q){
                    if(i >= top) {top = i;}
                }
                if(nowlocation == 0){
                    return cnt;
                }else{
                    nowlocation--;
                }
            }
        }
        return cnt;
    }
}