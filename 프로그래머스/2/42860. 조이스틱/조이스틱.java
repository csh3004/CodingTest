import java.util.*;
class Solution {
    public int solution(String name) {
    	int answer = 0;
    	Map<Character, Integer> map = new HashMap<>();
    	for(int i =0; i<26; i++) {
    		int j = 65 + i;
    		map.put((char) j, i);
    	}
    	
    	for(int i =0; i<name.length(); i++) {
    		char target = name.charAt(i);
    		int a = map.get(target);
    		int updown = Math.min(a, 26-a);
    		answer += updown;
    	}
    	
    	// 여기서 이제 좌우 값 더해줘야함.
    	int n = name.length();
    	int move = n -1; // 그냥 오른쪽 이동
    	
    	for (int i = 0; i < n; i++) {
            int next = i + 1;

            while (next < n && name.charAt(next) == 'A') {
                next++;
            }

            move = Math.min(move, i * 2 + (n - next));
            move = Math.min(move, (n - next) * 2 + i);
        }
    	
    	answer += move;
    	
        return answer;
    }
}