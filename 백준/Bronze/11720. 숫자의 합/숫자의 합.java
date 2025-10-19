import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String numStr = sc.next();
        int result = 0;
        
        for(int i=0; i<count; i++){
            String[] arr = numStr.split("");
            result += Integer.parseInt(arr[i]);
        }
        System.out.println(result);
    }
}