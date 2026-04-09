import java.io.*;
import java.util.*;

public class Main {
    static int row, col, cabbage;
    static int[][] land;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static void dfs(int x, int y) {
        land[x][y] = 0;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= row || ny < 0 || ny >= col) continue;
            if (land[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            row = Integer.parseInt(st.nextToken());
            col = Integer.parseInt(st.nextToken());
            cabbage = Integer.parseInt(st.nextToken());

            land = new int[row][col];
            int bugCount = 0;

            for (int i = 0; i < cabbage; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                land[x][y] = 1; // 배추심기
            }

            for (int x = 0; x < row; x++) {
                for (int y = 0; y < col; y++) {
                    if (land[x][y] == 1) {
                        bugCount++; // 배추 발견 버그 증가
                        dfs(x, y); // 붙어있으면 배추 없는걸로 간주
                    }
                }
            }

            System.out.println(bugCount);
        }
    }
}