import java.util.Arrays;

public class Lv1_02 {
    public static void main(String[] args) {

        int n = 10;
        int result = 0;
        for(int i=1; i<n; i++){

            if(n%i == 1){
                result = i;
                break;
            }
        }
        System.out.println(result);


    }
}
