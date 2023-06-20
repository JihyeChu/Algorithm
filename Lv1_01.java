import java.util.Arrays;

public class Lv1_01 {
    public static void main(String[] args) {
//      [추억 점수]
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
        };
//      ----------------------------------------------------

        int[] answer = new int[photo.length]; // 점수 함계를 담을 배열

        // 다중 for문을 사용했다. 시간복잡도 안좋음.
        for(int i=0; i<photo.length; i++){ // photo의 길이 만큼 0, 1, 2
            for(int j=0; j<photo[i].length; j++){ // photo[i]의 길이만큼 4, 4, 4
                for(int k=0; k<name.length; k++){ // name 배열 길이 만큼 0, 1, 2, 3
                    if(photo[i][j].equals(name[k])){ // photo의 배열 하나하나 name과 비교한다.
                        answer[i] += yearning[k]; // yearning의 길이와 name의 길이와 같기에 배열 방번호를 k로 넣어준다.
                    }
                }
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
