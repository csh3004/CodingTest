import java.io.*;
import java.util.*;

public class Main {
    static char[][] board;
    static char rightColor;
    static int boardX;
    static int boardY;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String size = br.readLine();
        StringTokenizer st = new StringTokenizer(size);

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        board = new char[x][y];
        boardX = x;
        boardY = y;

        for (int i = 0; i < x; i++) {
            String line = br.readLine();
            for (int j = 0; j < y; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int min = 64;

        for (int i = 0; i <= x - 8; i++) {
            for (int j = 0; j <= y - 8; j++) {
                int blackCnt = blackStart(i, j);
                int whiteCnt = whiteStart(i, j);
                min = Math.min(min, Math.min(blackCnt, whiteCnt));
            }
        }

        System.out.println(min);
    }

    private static int blackStart(int startX, int startY) {
        rightColor = 'W';
        int cnt = 0;

        for (int i = startX; i < startX + 8; i++) {
            changeColor();
            for (int j = startY; j < startY + 8; j++) {
                if (board[i][j] != rightColor) {
                    cnt++;
                }
                changeColor();
            }
        }
        return cnt;
    }

    private static int whiteStart(int startX, int startY) {
        rightColor = 'B';
        int cnt = 0;

        for (int i = startX; i < startX + 8; i++) {
            changeColor();
            for (int j = startY; j < startY + 8; j++) {
                if (board[i][j] != rightColor) {
                    cnt++;
                }
                changeColor();
            }
        }
        return cnt;
    }

    private static void changeColor() {
        rightColor = rightColor == 'B' ? 'W' : 'B';
    }
}