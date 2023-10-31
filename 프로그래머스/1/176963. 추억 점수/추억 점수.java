import java.util.HashMap;

class Solution {
     public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> year = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            year.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            for (String person : photo[i]) {
                for (String n : year.keySet()) {  
                    if (n.equals(person)) {
                        answer[i] += year.get(n);
                    }
                }
            }
        }

        return answer;
    }
}