
import java.util.Scanner;

public class Main {

	//1 2 4 8 16 32 64 --> 조합해서 x 도출
	
    public static void main(String[] args) {
    	int ans = 0;
    	int last = 100;
    	int cnt = 1;
    	int[] list = {64, 32, 16, 8, 4, 2, 1};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for(int i = 0; i<list.length; i++) {
        	if(target / list[i] == 1 && last > target % list[i]) {
        		ans = list[i];
        		last = target % list[i];
        	}
        }
        while(target != ans) {
        	for(int k = 0; k<list.length; k++) {
        		if(ans + list[k] <= target) {
        			ans = ans + list[k];
        			cnt++;
        		}
        	}
        	if(target == ans) {
        		break;
        	}
        }
        System.out.println(cnt);        
    }	
}