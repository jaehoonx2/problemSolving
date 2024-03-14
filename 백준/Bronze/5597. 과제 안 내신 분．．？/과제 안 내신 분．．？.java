import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] student_list = new int[30];
        int min = 31;
        int max = 0;        
        
        while(sc.hasNext()){
            int student_num = sc.nextInt();
            
            for(int i = 0; i < student_list.length; i++)
                student_list[i] += (i == student_num - 1 ? 1 : 0);
        }
        
        for(int j = 0; j < student_list.length; j++){
            if(student_list[j] == 0){
                min = j+1 < min ? j+1 : min;
                max = j+1 > max ? j+1 : max;
            }   
        }
        
        System.out.println(min);
        System.out.print(max);
    }
}