import java.util.ArrayList;
import java.util.HashMap;

public class A02 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain"};
        Integer[] yearning = {1,2,3};
        //name 이랑 점수는 1:1 로 매칭이기 때문에
        //해쉬맵 쓸생각.
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < name.length ; i++) {
            hashMap.put(name[i],yearning[i]);
        }
        String[][] photo = {
                {"may", "kein", "kain", "radi"}, //00 01 02 03
                {"may", "kein", "brin", "deny"}, //10 11 12 13
                {"kon", "kain", "may", "coni"}   //20 21 22 23
        };

        ArrayList<Integer> arrayList = new ArrayList<>();
        Integer sum = 0;

        // 1) 열 진행 할떄 해쉬맵에 있는지 없는지 확인 조건
        // 들어있다면 밸류값꺼네서 ++;
        // 열 진행 끝나면 합친 값 리스트에 넣어주고 초기화.

        for (int i = 0; i < photo.length ; i++) { //길이 100개일수도
            for (int j = 0; j < photo[i].length ; j++) {
                if (hashMap.containsKey(photo[i][j])){
                    sum += hashMap.get(photo[i][j]);
                }
            }
            arrayList.add(sum);
            sum = 0;
        }

        System.out.println(arrayList);

    }
}
