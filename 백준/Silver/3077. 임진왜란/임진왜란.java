import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> student = new ArrayList<>();
        
        for(int i = 0; i < total; i++) ans.add(sc.next());
        
        for(int i = 0; i < total; i++) student.add(sc.next());
        
        int correctCount = 0;
        
        int[] studentOrder = new int[total];
        for(int i = 0; i < total; i++) {
            for(int j = 0; j < total; j++) {
                if(ans.get(j).equals(student.get(i))) {
                    studentOrder[i] = j;
                    break;
                }
            }
        }
        
        for(int i = 0; i < total - 1; i++) {
            for(int j = i + 1; j < total; j++) {
                if(studentOrder[i] < studentOrder[j]) {
                    correctCount++;
                }
            }
        }
        
        System.out.println(correctCount + "/" + (total * (total - 1) / 2));
    }
}