import java.util.*;


class Solution {
public int[] solution(int N, int[] stages) {
        int[] answer = new int[N]; // 결과를 저장할 배열
        int[] count = new int[N]; // 스테이지에 도달한 플레이어의 수를 저장할 배열
        Map<Integer, Double> fail = new HashMap<>(); // key(스테이지), value(실패율)
        int total = stages.length; // 전체 플레이어수를 저장

        // 각 스테이지에 도달한 플레이어 수를 count배열에 넣기
        for (int i = 0; i < stages.length; i++) {
            if (stages[i] == N + 1) {
                continue;
            }
            count[stages[i] - 1]++;
        }

        // 실패율 계산하기
        for (int i = 0; i < count.length; i++) {
            // 만약 플레이어 수가 0인 경우 실패율 0
            if (total == 0) {
                fail.put(i, 0d);
                continue;
            }

            fail.put(i, (double) count[i] / (double) total);
            total -= count[i];
        }

        // List에 fail의 키값을 넣어줍니다.
        List<Map.Entry<Integer, Double>> sortedFail = new ArrayList<>(fail.entrySet());

        // 실패율을 기준으로 내림차순 정렬
        Collections.sort(sortedFail, (entry1, entry2) -> Double.compare(entry2.getValue(), entry1.getValue()));

        // List의 정렬된 스테이지를 배열에 담기
        for (int i = 0; i < N; i++) {
            // 0부터 시작해서 +1
            answer[i] = sortedFail.get(i).getKey() + 1;
        }

        return answer;
    }
}