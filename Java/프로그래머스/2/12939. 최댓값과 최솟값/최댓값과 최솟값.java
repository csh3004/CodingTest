import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int max = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[0]);
        for(int i = 0; i<str.length; i++){
            int temp = Integer.parseInt(str[i]);
            if(temp < min){
                min = temp;
            }
            if(temp > max){
                max = temp;
            }
        }
        answer = min + " " + max;
        return answer;
    }
}