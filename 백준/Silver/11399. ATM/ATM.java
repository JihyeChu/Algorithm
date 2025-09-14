import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        Integer[] times = new Integer[people];
        for(int i=0; i<people; i++){
            times[i] = sc.nextInt();
        }
        Arrays.sort(times);

        int sum = times[0]; 
        int result = sum;     
        for(int i=1; i<people; i++){
            sum += times[i];
            result += sum;
        }
        System.out.println(result);
    }
}
