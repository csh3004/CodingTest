class Solution {
    public int[] solution(int n) {
        int q = 0;
        if(n%2 == 1) {
            q = n+1;
            }else{
            q = n;
        }
        int[] answer = new int[q/2];
        int k = 0;
        for(int i = 0; i<=n; i++){
            if(i%2 == 1){
                answer[k] = i;
                k++;
            }
        }
        return answer;
    }
}