import java.io.*;
import java.util.*;

public class Main {
	static int[][] land;
	static boolean[][] visited;
	static int size;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	size = Integer.parseInt(br.readLine());
    	land = new int[size][size];
    	int maxHeight = 0;
    	
    	// 땅 세팅
    	for(int i = 0; i<size; i++) {
    		String row = br.readLine();
    		st = new StringTokenizer(row);
    		for(int j = 0; j<size; j++) {
    			land[i][j] = Integer.parseInt(st.nextToken());
    			maxHeight = Math.max(maxHeight, land[i][j]);
    		}
    	}
    	
    	int answer = 0;

        for (int rain = 0; rain <= maxHeight; rain++) {
            visited = new boolean[size][size];
            int cnt = 0;
            for (int x = 0; x < size; x++) {
                for (int y = 0; y < size; y++) {
                    if (land[x][y] > rain && !visited[x][y]) {
                        cnt++;
                        dfs(x, y, rain);
                    }
                }
            }

            answer = Math.max(answer, cnt);
        }

    	System.out.println(answer);
    }
    
	private static void dfs(int x, int y, int rain) {
		visited[x][y] = true;
		for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= size || ny < 0 || ny >= size) continue;
            if (land[nx][ny] <= rain) continue;
            if (visited[nx][ny]) continue;
            
            dfs(nx, ny, rain);
            
        }
	}
}