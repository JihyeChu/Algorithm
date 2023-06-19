import java.util.HashMap;

public class A01 {
    public static void main(String[] args) {
        String[] players = {"a","b","c","d"};
        String[] callings = {"c","c","d"};
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < players.length ; i++) {
            hashMap.put(players[i],i);
        }

        // 모르겟따 포기~
        for(String calling : callings){
            //change ranks
            int idx = hashMap.get(calling);  // c - 2
            hashMap.put(players[idx], idx - 1); // c -> 1
            hashMap.put(players[idx - 1], hashMap.get(players[idx - 1]) + 1); // b -> 2
            //swap players
            String temp = players[idx];  //temp -> c
            players[idx] = players[idx - 1];  //b->c
            players[idx - 1] = temp; // temp -> c->b
        }


//        // 맞는거 같은데 시간초과 뜸.
//        ArrayList<String> arrayList= new ArrayList<>(Arrays.asList(players));
//        //calling에서 불린 인덱스를 찾고
//        //지운다음에ㄴ 인덱스-1에 다시 넣어준다.
//        for (int i = 0 ; i < callings.length ; i++){
//            int idx = arrayList.indexOf(callings[i]);
//            arrayList.remove(idx);
//            int replaceidx = idx-1;
//            arrayList.add(replaceidx,callings[i]);
//        }

          // 좀더 깔끔한 버전 swap^^..그래도 안됌...
//        for (String calling : callings) {
//            swap(arrayList,arrayList.indexOf(calling)-1,arrayList.indexOf(calling) );
//        }


    }
}
