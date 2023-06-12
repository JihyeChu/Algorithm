import java.util.Arrays;

public class Lv0_1 {
    public static void main(String[] args) {

        String my_string = "Bcad";
        String answer = "";
        String[] value = my_string.toLowerCase().split("");
        Arrays.sort(value);

        for(int i=0; i<my_string.length(); i++){
            answer += value[i];
        }
        System.out.println(answer);

    }
}
