import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int heard = Integer.parseInt(st.nextToken());
        int see = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < heard; i++) {
            set.add(br.readLine());
        }

        for (int j = 0; j < see; j++) {
            String name = br.readLine();
            if (set.contains(name)) {
                result.add(name);
            }
        }

        Collections.sort(result);

        StringBuilder sb = new StringBuilder();
        sb.append(result.size()).append("\n");
        for (String name : result) {
            sb.append(name).append("\n");
        }

        System.out.print(sb);
    }
}