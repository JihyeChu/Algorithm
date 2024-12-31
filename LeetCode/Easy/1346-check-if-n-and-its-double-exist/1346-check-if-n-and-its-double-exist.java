import java.util.HashMap;

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a : arr){
            if(map.containsKey(a*2) || (a%2 == 0 && map.containsKey(a/2))){
                return true;
            }
            map.put(a, a*2);
        }
        return false;
    }
}