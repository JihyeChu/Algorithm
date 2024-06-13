import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String a = sc.next();
        for(int i=0; i<a.length(); i++){
           if(a.charAt(i) == a.toLowerCase().charAt(i)){
                sb.append(a.toUpperCase().charAt(i));
            }else{
               sb.append(a.toLowerCase().charAt(i));
           }
        }
        System.out.println(sb.toString());
    }
}