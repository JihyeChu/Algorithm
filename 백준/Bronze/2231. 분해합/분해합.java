import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        for(int i=1; i<=num; i++){
            int sum = i;
            int temp = i;
            while(temp > 0){
                sum += temp%10;
                temp /= 10;
            }

            if(sum == num){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }    
}