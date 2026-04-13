import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        
        Integer[] A = new Integer[L];
        Integer[] B = new Integer[L];
        
        String lineA = br.readLine();
        StringTokenizer st = new StringTokenizer(lineA);
        for(int i = 0; i<L; i++) {
        	A[i] = Integer.parseInt(st.nextToken()); 
        }
        
        String lineB = br.readLine();
        st = new StringTokenizer(lineB);
        for(int i = 0; i<L; i++) {
        	B[i] = Integer.parseInt(st.nextToken()); 
        }
        
        Arrays.sort(A);
        Arrays.sort(B,Collections.reverseOrder());
        int sum = 0;
        for(int i = 0; i<L; i++) {
        	sum += A[i] * B[i]; 
        }
        System.out.println(sum);
    }
}