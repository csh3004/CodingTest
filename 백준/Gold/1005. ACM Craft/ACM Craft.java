import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int t = 0; t < testCase; t++) {
            String[] count = br.readLine().split(" ");
            int buildingCount = Integer.parseInt(count[0]);
            int ruleCount = Integer.parseInt(count[1]);

            int[] buildingTime = new int[buildingCount + 1];
            String[] buildingTimeList = br.readLine().split(" ");
            for (int i = 1; i <= buildingCount; i++) {
                buildingTime[i] = Integer.parseInt(buildingTimeList[i - 1]);
            }

            Map<Integer, List<Integer>> ruleMap = new HashMap<>();
            int[] indegree = new int[buildingCount + 1];
            int[] dp = new int[buildingCount + 1];

            for (int i = 0; i < ruleCount; i++) {
                String[] rule = br.readLine().split(" ");
                int from = Integer.parseInt(rule[0]);
                int to = Integer.parseInt(rule[1]);

                if (ruleMap.get(from) == null) {
                    ruleMap.put(from, new ArrayList<>());
                }
                ruleMap.get(from).add(to);
                indegree[to]++;
            }

            int target = Integer.parseInt(br.readLine());

            Queue<Integer> queue = new LinkedList<>();

            for (int i = 1; i <= buildingCount; i++) {
                dp[i] = buildingTime[i];
                if (indegree[i] == 0) {
                    queue.offer(i);
                }
            }

            while (!queue.isEmpty()) {
                int current = queue.poll();

                if (ruleMap.get(current) == null) {
                    continue;
                }

                for (int next : ruleMap.get(current)) {
                    dp[next] = Math.max(dp[next], dp[current] + buildingTime[next]);
                    indegree[next]--;

                    if (indegree[next] == 0) {
                        queue.offer(next);
                    }
                }
            }

            System.out.println(dp[target]);
        }
    }
}