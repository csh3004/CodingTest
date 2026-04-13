import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int L = Integer.parseInt(br.readLine());
        String[] names = new String[L];

        for(int i = 0; i<L; i++) {
        	names[i] = br.readLine();
        }
        
        for(int i = 0; i<names[0].length(); i++) {
        	boolean isSame = true;
        	for(int j = 1; j<L; j++) {
            	if(names[j-1].charAt(i) != names[j].charAt(i)) {
            		isSame = false;
            	}
            }
        	if(isSame) {
        		sb.append(names[0].charAt(i));
        	}else {
        		sb.append("?");
        	}
        }
        System.out.println(sb);
        
    }
}