import java.io.*;
import java.util.*;

public class Main {
	static int[][] board;
	static int ans = 1;
	static int x;
	static int y;
	static int maxSize;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        StringTokenizer st = new StringTokenizer(S);
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        
        maxSize = Math.min(x, y);
        
        //판 세팅
        board = new int[x][y];
        for(int i = 0; i<x; i++) {
        	S = br.readLine();
        	for(int j = 0; j<y; j++) {
        		board[i][j] = S.charAt(j);
        	}
    	}
    	find();
        System.out.println(ans*ans);
    }

	private static void find() {
		int n = 1;
		while(n <= maxSize) {
			for(int i = 0; i<x-n; i++) {
				for(int j = 0; j<y-n; j++) {
					if(i+n >= x || j+n >= y) continue;
					if(board[i][j] == board[i+n][j] && board[i][j] == board[i][j+n] && board[i][j] == board[i+n][j+n]) {
						ans = n+1;
					}
				}
			}
			n++;
		}
		
	}
}