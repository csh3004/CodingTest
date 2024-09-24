import java.util.*;
class Solution {
    public int[] solution(String s) {
        int times = 0;   
        int zerocnt = 0;
        
        while(s.length() > 1) {
            int countZeros = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    countZeros++;
                }
            }
            zerocnt += countZeros;
            times++;            
            int remainingLength = s.length() - countZeros;
            s = Integer.toBinaryString(remainingLength);
        }
        return new int[] {times, zerocnt};
    }
}