import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int ans = 0;
        String line = br.readLine();
        if(L == 1) {
        	int num = Integer.parseInt(line);
        	ans = num * num;
        	System.out.println(ans);
        }else {
        	int[] list = new int[L];
        	StringTokenizer st = new StringTokenizer(line);
        	for(int i = 0; i<L; i++) {
        		list[i] = Integer.parseInt(st.nextToken());
        	}
        	Arrays.sort(list);
        	int min = list[0];
        	int max = list[list.length - 1];
        	System.out.println(min * max);
        }
    }
}