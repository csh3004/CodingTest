import java.io.*;
import java.util.*;

public class Main {
    static HashMap<Integer, List<Integer>> lineMap = new HashMap<>();
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    
    static void dfs(int start) {
        visited[start] = true;
        sb.append(start).append(" ");

        List<Integer> nextList = lineMap.get(start);
        if (nextList == null) return;

        for (int next : nextList) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            sb.append(now).append(" ");

            List<Integer> nextList = lineMap.get(now);
            if (nextList == null) continue;

            for (int next : nextList) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String line = br.readLine();
       StringTokenizer st = new StringTokenizer(line);
       
       int totalDot = Integer.parseInt(st.nextToken());
       int totalLine = Integer.parseInt(st.nextToken());
       int startDot = Integer.parseInt(st.nextToken());
       
       for (int i = 1; i <= totalDot; i++) {
    	   lineMap.put(i, new ArrayList<>());
       }
       
       for (int i = 0; i < totalLine; i++) {
           st = new StringTokenizer(br.readLine());
           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());

           lineMap.get(a).add(b);
           lineMap.get(b).add(a);
       }
       
       for (int i = 1; i <= totalDot; i++) {
           Collections.sort(lineMap.get(i));
       }

       visited = new boolean[totalDot+1];
       dfs(startDot);
       sb.append('\n');

       visited = new boolean[totalDot+1];
       bfs(startDot);

       System.out.println(sb);
    }
}