import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int kind = sc.nextInt();
        int price = sc.nextInt();
        
        Integer[] coins = new Integer[kind];
        
        for(int i=0; i<kind; i++){
            coins[i] = sc.nextInt();    
        }
        
        Arrays.sort(coins, Collections.reverseOrder());
        
        int count = 0;
       
       for(int coin : coins){
           count += price/coin;
           price %= coin;
           if(price == 0) break;
       }
        
        System.out.println(count);
        sc.close();
    }
}