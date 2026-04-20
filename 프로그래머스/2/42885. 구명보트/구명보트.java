import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int cnt = people.length;
        int light = 0;
        int heavy = cnt -1;
        int answer = 0;
        
        Arrays.sort(people);
        while(light <= heavy) {
        	if (people[light] + people[heavy] <= limit) {
        		light++;
            }
        	heavy--;
            answer++;
        }
        return answer;
    }
}