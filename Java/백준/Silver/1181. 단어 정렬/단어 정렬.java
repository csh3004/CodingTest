
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int testcase = sc.nextInt();
    	String[] arr = new String[testcase];
    	ArrayList<String> arr2 = new ArrayList<>(); 
    	
    	for(int i = 0; i<arr.length; i++) {
    		arr[i] = sc.next();
    	}
    	
    	for(int i = 0; i<arr.length; i++) {
    		if(!arr2.contains(arr[i])) {
    			arr2.add(arr[i]);
    		}
    	}
    	
    	Collections.sort(arr2, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return Integer.compare(s1.length(), s2.length());
                }
                return s1.compareTo(s2);
            }
        });
    	
        for (String s : arr2) {
            System.out.println(s);
        }
    }
}