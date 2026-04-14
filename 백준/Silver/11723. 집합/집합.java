import java.io.*;
import java.util.*;

public class Main {
	static Set<Integer> arr = new HashSet<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(T>0) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String command = st.nextToken();
        	int value = 0;
        	switch(command) {
        		case "add":
        				arr.add(Integer.parseInt(st.nextToken()));
        			break;
        		case "remove":
        				arr.remove(Integer.parseInt(st.nextToken()));
        			break;
        		case "check":
        				value = Integer.parseInt(st.nextToken());
        				if(arr.contains(value)) {
        					sb.append(1);
        				}else {
        					sb.append(0);
        				}
        				sb.append("\n");
        			break;
        		case "toggle":
	        			value = Integer.parseInt(st.nextToken());
	    				if (arr.contains(value)) {
	    					arr.remove(value);
	    				} else {
	    					arr.add(value);
	    				}
        			break;
        		case "all":
        				arr = new HashSet<>();
        				for (int j = 1; j <= 20; j++) {
        					arr.add(j);
        				}
        			break;
        		case "empty":
        				arr.clear();
        			break;
        		
        	}
        	T--;
        }
        System.out.println(sb.toString());
	}
}