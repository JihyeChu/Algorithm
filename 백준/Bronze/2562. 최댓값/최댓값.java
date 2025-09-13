import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int count = 0;
        
        // 비교
        for(int i=0; i<9; i++){
            if(max < arr[i]){
                max = arr[i];
                count = i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}