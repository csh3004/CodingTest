import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int testCase = sc.nextInt();
    	for(int i = 0; i<testCase; i++) {
    		int x1 = sc.nextInt();
    		int y1 = sc.nextInt();
    		int d1 = sc.nextInt();
    		
    		int x2 = sc.nextInt();
    		int y2 = sc.nextInt();
    		int d2 = sc.nextInt();
    		
    		int distance = (int) (Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
    		 
    		// 중점 같고 반지름 같은 경우
    		if(x1 == x2 && y1 == y2 && d1 == d2) {
    			System.out.println("-1");
    			continue;
    		}
    		
    		// 완전 떨어진 경우
    		if(distance > Math.pow(d1 + d2, 2)) {
    			System.out.println("0");
    			continue;
    		}
    		
    		// 외접 하는 경우
    		if(distance == Math.pow(d1 + d2, 2)) {
    			System.out.println("1");
    			continue;
    		}
    		
    		// 내접 하는 경우
    		if(distance == Math.pow(d1 - d2, 2)) {
    			System.out.println("1");
    			continue;
    		}
    		
    		// 안에서 포함 되는 경우
    		if(distance < Math.pow(d1 - d2, 2)) {
    			System.out.println("0");
    			continue;
    		}
    		System.out.println("2");
    	}
    }
}