import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        StringTokenizer st = new StringTokenizer(S);
        int needLine = Integer.parseInt(st.nextToken());

        int shopLength = Integer.parseInt(st.nextToken());
     
        int[] setPrice = new int[shopLength];
        int[] unitPrice = new int[shopLength];
        
        for(int i = 0; i<shopLength; i++) {
        	st = new StringTokenizer(br.readLine());
        	setPrice[i] = Integer.parseInt(st.nextToken());
        	unitPrice[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(setPrice);
        Arrays.sort(unitPrice);
        int price = Integer.MAX_VALUE;
        
        int minimalSet = needLine/6;
        
        int allSet = needLine/6;
        if(needLine%6 > 0) allSet++;
        
        
        int allSetMount = allSet * setPrice[0];
        price = Math.min(price, allSetMount);
        
        int allUnitMount = needLine * unitPrice[0];
        price = Math.min(price, allUnitMount);
        
        int mixMount = minimalSet * setPrice[0] + (needLine%6) * unitPrice[0];
        price = Math.min(price, mixMount);
        
        System.out.println(price);
        
    }
}