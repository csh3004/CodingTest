import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cnt = 0;
        for(int i : scoville){
            pq.add(i);
        }
        while(pq.peek() < K){
            if(pq.size() < 2){return -1;}
            pq.add(pq.poll() + (pq.poll() * 2));
            cnt++;
        }
        return cnt;
    }
}