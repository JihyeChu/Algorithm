import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<count; i++){
            String line = sc.nextLine();
            String[] arr = line.split(",");

            int a = Integer.parseInt(arr[0].trim());
            int b = Integer.parseInt(arr[1].trim());
            System.out.println(a + b);
        }
    }
}