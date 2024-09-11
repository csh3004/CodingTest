import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        //시작이 ')'로 시작하는 경우 return false;
        if(s.charAt(0) == ')') return false;
        int i = 0;
        char[] arr = s.toCharArray();
        for(char c : arr){
            if(c == '('){
                i++;
            }else{
                i--;
                if(i <0){return false;}
            }
        }
        if(i == 0) {return true;} else return false;
    }
}