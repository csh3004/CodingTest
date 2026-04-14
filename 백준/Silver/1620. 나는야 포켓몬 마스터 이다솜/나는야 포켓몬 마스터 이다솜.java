import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int poketmonCnt = Integer.parseInt(st.nextToken());
        int ansCnt = Integer.parseInt(st.nextToken());

        String[] numToName = new String[poketmonCnt + 1];
        Map<String, Integer> nameToNum = new HashMap<>();

        for (int i = 1; i <= poketmonCnt; i++) {
            String name = br.readLine();
            numToName[i] = name;
            nameToNum.put(name, i);
        }

        for (int i = 0; i < ansCnt; i++) {
            String s = br.readLine();

            try {
                int n = Integer.parseInt(s);
                sb.append(numToName[n]).append('\n');
            } catch (NumberFormatException e) {
                sb.append(nameToNum.get(s)).append('\n');
            }
        }

        System.out.print(sb);
    }
}