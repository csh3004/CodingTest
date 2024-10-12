import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridge = new LinkedList<>();
        Queue<Integer> times = new LinkedList<>(); 
        
        int current_weight = 0;
        int index = 0;

        while (index < truck_weights.length || !bridge.isEmpty()) {
            answer++; 
            
            if (!times.isEmpty() && times.peek() == answer) {
                current_weight -= bridge.poll(); 
                times.poll(); 
            }

            if (index < truck_weights.length && current_weight + truck_weights[index] <= weight) {
                bridge.add(truck_weights[index]);
                current_weight += truck_weights[index];
                times.add(answer + bridge_length);
                index++;
            }
        }

        return answer;
    }
}