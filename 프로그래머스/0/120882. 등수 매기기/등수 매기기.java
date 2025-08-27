import java.util.*;
import javafx.util.Pair;

class Solution {
    public int[] solution(int[][] score) {
        int[] result = new int[score.length];
        List<Pair<Double, Integer>> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            double avg = (score[i][0] + score[i][1]) / 2.0;
            list.add(new Pair<>(avg, i));
        }

        list.sort((a, b) -> Double.compare(b.getKey(), a.getKey()));

        int rank = 1;
        result[list.get(0).getValue()] = rank;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getKey().equals(list.get(i - 1).getKey())) {
                result[list.get(i).getValue()] = rank;
            } else {
                rank = i+1;
                result[list.get(i).getValue()] = rank;
            }
        }

        return result;
    }
}
