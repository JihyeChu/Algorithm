package Lv0;

import java.util.Arrays;
import java.util.Objects;

public class Lv0_6 {
//    [로그인 성공 ?]
    public static void main(String[] args) {
        String[][] db = {
                {"rardss", "123"},
                {"yyoom", "1234"},
                {"meosseugi", "1234"}
        };
        String[] id_pw = {"meosseugi", "1234"};
//     ---------------------------------------------------------------------
        String answer = "";
        for(int i=0; i<db.length; i++){
            if(db[i][0].equals(id_pw[0]) && db[i][1].equals(id_pw[1])){
                answer = "login";
                break;
            }else if(db[i][0].equals(id_pw[0]) && !(db[i][1].equals(id_pw[1]))){
                answer = "wrong pw";
                break;
            }else{
                answer = "fail";
            }
        }
        System.out.println(answer);

//        Arrays.stream(db).allMatch(a -> id_pw.equals(db));

    }
}
