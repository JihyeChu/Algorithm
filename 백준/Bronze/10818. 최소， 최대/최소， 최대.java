import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numList = new int[num]; 
        int MIN = Integer.MAX_VALUE;
        int MAX = Integer.MIN_VALUE;
        
        for(int i=0; i<num; i++){
            numList[i] = sc.nextInt();
        }
        
        for(int i=0; i<num; i++){
            if(numList[i] > MAX){
                MAX = numList[i];
            }
            if(numList[i] < MIN){
                MIN = numList[i];
            }
        }
        System.out.print(MIN + " " + MAX);
    }
}