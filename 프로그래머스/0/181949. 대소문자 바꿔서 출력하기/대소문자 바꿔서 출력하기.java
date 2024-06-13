import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String a = sc.next();
        for(Character c : a.toCharArray()){
           if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }else{
               sb.append(Character.toLowerCase(c));
           }
        }
        System.out.println(sb.toString());
    }
}