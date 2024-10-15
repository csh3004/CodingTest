import java.util.*;

class Solution {
    HashSet<Integer> numberSet = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        boolean[] visited = new boolean[7];
        f("",numbers,visited);
        for(int i : numberSet){
            if(test(i)){
                answer++;
            }
        }
        return answer;
    }
    
    public void f(String current, String numbers, boolean[] visited){
        if(!current.equals("")){
            numberSet.add(Integer.valueOf(current));
        }
        for(int i = 0; i<numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                f(current + numbers.charAt(i), numbers, visited);
                visited[i] = false;
            }
        }
    }
    public boolean test(int num){
        if(num < 2){
            return false;
        }
        for(int i = 2; i<num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}