import java.util.ArrayList;
import java.util.Collections;

public class Prac {
    public static void main(String[] args) {
        String my_string = "aksjdnSDQ";
        String a =my_string.toLowerCase();
        ArrayList<Character> b =new ArrayList<>();

        for (int i =0 ; i<a.length() ; i++){
            char c = a.charAt(i);
            b.add(c);
        }

        Collections.sort(b);

        String answer = "";

        for(int i = 0; i < b.size(); i++)
        {
            answer += b.get(i);
        }
        System.out.println(answer);
//        return answer;
    }

}
