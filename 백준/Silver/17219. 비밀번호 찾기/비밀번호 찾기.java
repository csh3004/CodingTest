import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int siteCnt = Integer.parseInt(st.nextToken());
        int passwordCnt = Integer.parseInt(st.nextToken());
        
        HashMap<String, String> map = new HashMap<>();
        
        for(int i = 0; i<siteCnt; i++) {
        	st = new StringTokenizer(br.readLine());
        	String site = st.nextToken();
        	String pw = st.nextToken();
        	map.put(site, pw);
        }
        
        for(int i = 0; i<passwordCnt; i++) {
        	String pw = map.get(br.readLine());
        	sb.append(pw).append("\n");
        }
        System.out.println(sb);
    }
}