import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        String a = sc.next();
        for(Character c : a.toCharArray()){
           if(Character.isLowerCase(c)){
                answer += Character.toUpperCase(c);
            }else{
               answer += Character.toLowerCase(c);
           }
        }
        System.out.println(answer);
    }
}