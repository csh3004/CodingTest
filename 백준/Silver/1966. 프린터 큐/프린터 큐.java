import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        while(T>0) {
//        	4 2  4개의 문서중 2 index
//        	1 2 3 4 1 = 0번
        	int ans = 0;
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int sheetCnt = Integer.parseInt(st.nextToken());
        	int target = Integer.parseInt(st.nextToken());
        	LinkedList<Integer> sheetQ = new LinkedList<>();
        	LinkedList<Integer> primaryQ = new LinkedList<>();
        	st = new StringTokenizer(br.readLine());
        	
        	for(int i = 0; i<sheetCnt; i++) {
        		int n = Integer.parseInt(st.nextToken());
        		sheetQ.add(i);
        		primaryQ.add(n);
        	}
        	
        	while(!sheetQ.isEmpty()) {
        		boolean isMaxPrimary = true;
        		
        		int currentPrimary = primaryQ.peek();
        		for(int i = 0; i<primaryQ.size(); i++) {
        			if(currentPrimary < primaryQ.get(i)) {
        				isMaxPrimary = false;
        				break;
        			}
        		}
        		
        		if(!isMaxPrimary) {
        			sheetQ.add(sheetQ.poll());
        			primaryQ.add(primaryQ.poll());
        			continue;
        		}
        		ans++;
        		primaryQ.poll();
        		int a = sheetQ.poll();
        		
        		if(a == target) {
        			System.out.println(ans);
        			break;
        		}

        	}
        	T--;
        }
	}
}